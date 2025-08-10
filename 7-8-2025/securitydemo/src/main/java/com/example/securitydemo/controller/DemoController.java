package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - no authentication required!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User - authentication required!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin - authentication required!";
    }
}
