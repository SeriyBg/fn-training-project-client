package com.training.fnparser.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.HostResponse;
import com.training.fnparser.model.IpHost;
import com.training.fnparser.model.RouteCmdResponse;
import com.training.fnparser.service.HostService;
import com.training.fnparser.thymeleaf.form.HostForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HostParametersController {
    @Autowired
    private HostService hostService;
    private static List<RouteCmdResponse.Host> hosts = new ArrayList<RouteCmdResponse.Host>();
    private static IpHost ipHost;
    private String errorMessage = "POST 'http:localhost:8086/host' failed";

    @RequestMapping(value = { "/hostParameters" }, method = RequestMethod.GET)
    public String getHostParameters(Model model) {

        model.addAttribute("hosts", hosts);
        return "hostParameters";
    }

    @RequestMapping(value = { "/addHost" }, method = RequestMethod.GET)
    public String showHostPage(Model model) {
        HostForm hostForm = new HostForm();

        model.addAttribute("hostForm", hostForm);
        return "addHost";
    }

    @RequestMapping(value = { "/addHost" }, method = RequestMethod.POST)
    public String sendHostRequest(Model model, @ModelAttribute("hostForm") HostForm hostForm) {
        String addr = hostForm.getAddr();
        String user = hostForm.getUser();
        String password = hostForm.getPassword();

        HostRequest hostRequest = new HostRequest(addr, user, password);
        HostResponse hostResponse = hostService.startCollectHostData(hostRequest);
        if (hostResponse != null) {
            hosts.add(new RouteCmdResponse.Host(addr, user, password, hostResponse.getId(), hostResponse.getStatus()));

            return "redirect:/hostParameters";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "addHost";
    }


    @RequestMapping(value = "/hostData")
    public String showHostData(Model model, @RequestParam("hostId") long hostId) {
        ipHost = hostService.getHostById(hostId);

        model.addAttribute("ipHost", ipHost);

        if (ipHost != null) {
            return "hostData";
        }

        return "redirect:/addHost";
    }
}
