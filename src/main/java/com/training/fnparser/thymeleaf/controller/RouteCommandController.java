package com.training.fnparser.thymeleaf.controller;

import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.RouteCmd;
import com.training.fnparser.model.RouteCmdResponse;
import com.training.fnparser.service.RouteService;
import com.training.fnparser.thymeleaf.form.RouteCmdForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RouteCommandController {
    @Autowired
    private RouteService routeService;
    private static List<RouteStatus> routes = new ArrayList<>();
    private String errorMessage = "Failed connect to 'http:localhost:8086/host'";

    private class RouteStatus {
        public String time;
        public String status;
        public String command;

        RouteStatus(String time, String status, String command) {
            this.time = time;
            this.status = status;
            this.command = command;
        }
    }

    @RequestMapping(value = { "/routeCommands" }, method = RequestMethod.GET)
    public String getRouteCommands(Model model) {

        model.addAttribute("routes", routes);
        return "routeCommands";
    }

    @RequestMapping(value = { "/addRouteCmd" }, method = RequestMethod.GET)
    public String showRouteCommand(Model model) {
        RouteCmdForm routeCmdForm = new RouteCmdForm();

        model.addAttribute("routeCmdForm", routeCmdForm);
        return "addRouteCmd";
    }

    @RequestMapping(value = { "/addRouteCmd" }, method = RequestMethod.POST)
    public String sendRouteCommand(Model model, @ModelAttribute("routeCmdForm") RouteCmdForm routeCmdForm) {
        String addr = routeCmdForm.getAddr();
        String user = routeCmdForm.getUser();
        String password = routeCmdForm.getPassword();
        String command = routeCmdForm.getCommand();

        RouteCmd routeCmd = routeService.parseRouteCmd(command);
        String parserStatus = routeService.getParseStatus();
        if (parserStatus != null) {
            model.addAttribute("errorMessage", parserStatus);
            return "addRouteCmd";
        }

        routeCmd.setHostRequest(new HostRequest(addr, user, password));
        RouteCmdResponse routeCmdResponse = routeService.sendRouteCmd(routeCmd);
        if (routeCmdResponse != null && !routeCmdResponse.getStatus().isEmpty()) {
            routes.add(new RouteStatus(LocalTime.now().toString(), routeCmdResponse.getStatus(), command));
            return "redirect:/routeCommands";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "addRouteCmd";
    }

}
