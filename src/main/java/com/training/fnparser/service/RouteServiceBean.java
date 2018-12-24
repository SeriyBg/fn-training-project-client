package com.training.fnparser.service;

import com.google.gson.Gson;
import com.training.fnparser.antlr4.RouteCmdVisitor;
import com.training.fnparser.antlr4.gen.RouteCommandLexer;
import com.training.fnparser.antlr4.gen.RouteCommandParser;
import com.training.fnparser.model.RouteCmd;
import com.training.fnparser.model.RouteCmdResponse;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RouteServiceBean implements RouteService {
    private RouteCmdVisitor routeCmdVisitor;
    private final String ROUTE_CMD_URL = "http://localhost:8086/routes/cmd";
    private HttpHeaders headers;

    RouteServiceBean() {
        headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @Override
    public RouteCmd parseRouteCmd(CharStream charStream) {
        RouteCommandLexer lexer = new RouteCommandLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RouteCommandParser parser = new RouteCommandParser(tokens);
        ParseTree tree = parser.route();

        routeCmdVisitor = new RouteCmdVisitor(new RouteCmd());
        routeCmdVisitor.visit(tree);

        return routeCmdVisitor.getRouteCmd();
    }

    @Override
    public RouteCmd parseRouteCmd(String str) {
        return parseRouteCmd(CharStreams.fromString(str));
    }

    @Override
    public String getParseStatus() {
        return routeCmdVisitor.getParseErrorMsg();
    }

    @Override
    public RouteCmdResponse sendRouteCmd(RouteCmd routeCmd) {
        HttpEntity<String> requestBody = new HttpEntity<>((new Gson().toJson(routeCmd)), headers);

        RestTemplate restTemplate = new RestTemplate();
        RouteCmdResponse response = null;
        try {
            response = restTemplate.postForObject(ROUTE_CMD_URL, requestBody, RouteCmdResponse.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }
}
