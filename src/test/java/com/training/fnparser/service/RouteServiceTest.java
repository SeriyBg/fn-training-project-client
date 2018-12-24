package com.training.fnparser.service;

import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.RouteCmd;
import com.training.fnparser.model.RouteCmdResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class RouteServiceTest {
    @Autowired
    private RouteService routeService;
    private final String ADD_ROUTE_CMD_STR =
            "route add -net 10.20.30.0 netmask 255.255.255.0 gw 192.168.1.100";

    @Test
    public void RouteServiceRouteAddDelTest() {
        RouteCmd routeCmd = routeService.parseRouteCmd(ADD_ROUTE_CMD_STR);

        routeCmd.setHostRequest(new HostRequest("127.0.0.1", "root", "jnjnuh"));
        RouteCmdResponse routeCmdResponse = routeService.sendRouteCmd(routeCmd);

        assertNotNull("POST 'http:localhost:8086/routes/cmd' failed", routeCmdResponse);

        if (routeCmdResponse != null) {
            assertNotNull("'status' field is empty", routeCmdResponse.getStatus());
        }
    }
}
