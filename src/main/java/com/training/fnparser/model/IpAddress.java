package com.training.fnparser.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@Data
@ToString
public class IpAddress {
    private Long id;
    private String addr;
    private String netmask;
}
