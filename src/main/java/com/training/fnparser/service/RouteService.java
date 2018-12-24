package com.training.fnparser.service;

import com.training.fnparser.model.RouteCmd;
import com.training.fnparser.model.RouteCmdResponse;
import org.antlr.v4.runtime.CharStream;

public interface RouteService {
    RouteCmd parseRouteCmd(CharStream charStream);
    RouteCmd parseRouteCmd(String str);
    String getParseStatus();
    RouteCmdResponse sendRouteCmd(RouteCmd routeCmd);
}
