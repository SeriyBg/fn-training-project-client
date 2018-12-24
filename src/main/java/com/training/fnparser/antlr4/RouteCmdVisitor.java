package com.training.fnparser.antlr4;

import com.training.fnparser.antlr4.gen.RouteCommandBaseVisitor;
import com.training.fnparser.antlr4.gen.RouteCommandParser;
import com.training.fnparser.model.RouteCmd;
import lombok.Getter;
import lombok.extern.java.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log
public class RouteCmdVisitor extends RouteCommandBaseVisitor<Object> {
    @Getter private RouteCmd routeCmd;
    @Getter private String parseErrorMsg;
    private static final Pattern IPADDR_PATTERN = Pattern.compile("(?<ipaddr>([0-9]{1,3}.){3}[0-9]{1,3})");

    public RouteCmdVisitor(RouteCmd routeCmd) {
        this.routeCmd = routeCmd;
    }

    private void setErrorMsg(String msg) {
        parseErrorMsg = "Error: " + msg;
        log.info(parseErrorMsg);
    }

    @Override
    public Object visitRoute(RouteCommandParser.RouteContext ctx) {
        parseErrorMsg = null;
        return visitChildren(ctx);
    }

    @Override
    public Object visitAddCmd(RouteCommandParser.AddCmdContext ctx) {
        if (!ctx.getText().equals("add")) {
            setErrorMsg("Unsupported command, use add/delete only");
            return 0;
        }
        routeCmd.setCommand(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitDelCmd(RouteCommandParser.DelCmdContext ctx) {
        if (!ctx.getText().equals("del")) {
            setErrorMsg("Unsupported command, use add/delete only");
            return 0;
        }
        routeCmd.setCommand(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitNetAddress(RouteCommandParser.NetAddressContext ctx) {
        if (!ctx.getText().equals("-net")) {
            setErrorMsg("Unsupported command, use -net/-host only");
            return 0;
        }
        routeCmd.setNetwork(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitHostAddress(RouteCommandParser.HostAddressContext ctx) {
        if (!ctx.getText().equals("-host")) {
            setErrorMsg("Unsupported command, use -net/-host only");
            return 0;
        }
        routeCmd.setNetwork(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitIpAddress(RouteCommandParser.IpAddressContext ctx) {
        Matcher matcher = IPADDR_PATTERN.matcher(ctx.getText());
        if (!matcher.find()) {
            setErrorMsg("Invalid network/host IP Address: " + ctx.getText());
            return 0;
        }
        routeCmd.setRoutingIp(ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Object visitNetmaskAddress(RouteCommandParser.NetmaskAddressContext ctx) {
        String netmask = ctx.IP() != null ? ctx.IP().getText() : "";
        Matcher matcher = IPADDR_PATTERN.matcher(netmask);
        if (!matcher.find()) {
            setErrorMsg("Invalid network netmask: " + netmask);
            return 0;
        }
        routeCmd.setNetmask(netmask);
        return visitChildren(ctx);
    }

    @Override public Object visitGwAddress(RouteCommandParser.GwAddressContext ctx) {
        String gw = ctx.IP() != null ? ctx.IP().getText() : "";
        Matcher matcher = IPADDR_PATTERN.matcher(gw);
        if (!matcher.find()) {
            setErrorMsg("Invalid gateway IP Address: " + gw);
            return 0;
        }
        routeCmd.setGatewayIp(gw);
        return visitChildren(ctx);
    }
}
