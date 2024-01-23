package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/app")
    public String sendGreetings() {
        return "This is a basic Springboot Application";
    }
}
