package com.thisispawann.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello World!";
    }
}
