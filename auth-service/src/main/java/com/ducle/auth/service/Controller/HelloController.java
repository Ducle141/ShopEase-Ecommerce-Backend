package com.ducle.auth.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "GET: Greetings from Auth Service!";
    }

    @PostMapping("/")
    public String postIndex(){
        return "POST: Greetings from Auth Service!";
    }


}
