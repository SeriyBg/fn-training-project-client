package com.training.fnparser.model;

import lombok.Data;

@Data
public class RouteCmd {
    private String command;
    private String network;
    private String routingIp;
    private String netmask;
    private String gatewayIp;
    private HostRequest hostRequest;
}
