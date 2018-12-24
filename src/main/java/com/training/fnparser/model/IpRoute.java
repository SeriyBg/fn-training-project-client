package com.training.fnparser.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@Data
@ToString
public class IpRoute {
    private Long id;
    private String destination;
    private String gateway;
    private String genmask;
    private String flags;
    private int metric;
    private int refs;
    private IpInterface iface;
}
