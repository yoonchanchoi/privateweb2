package com.example.chc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String homeView() {
        return "index";
    }
    @GetMapping("/login")
    public String loginView() {
        return "login";
    }
    @GetMapping("/register")
    public String registerView() {
        return "register";
    }
    @GetMapping("/password")
    public String passwordView() {
        return "password";
    }
}