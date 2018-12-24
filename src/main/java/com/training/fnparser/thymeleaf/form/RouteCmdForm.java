package com.training.fnparser.thymeleaf.form;

import lombok.Data;

@Data
public class RouteCmdForm {
    private String addr;
    private String user;
    private String password;
    private String command;
}
