package com.training.fnparser.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@Data
@ToString
public class IpInterface {
    private Long id;
    private String name;
    private String macAddress;
    private IpAddress ipAddress;
    private int mtu;
}
