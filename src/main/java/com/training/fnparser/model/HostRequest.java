package com.training.fnparser.model;

import lombok.Data;

@Data
public class HostRequest {
    private String addr;
    private String user;
    private String password;

    public HostRequest(String addr, String user, String password) {
        this.addr = addr;
        this.user = user;
        this.password = password;
    }
}
