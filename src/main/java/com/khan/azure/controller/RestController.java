package com.khan.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/message")
    public String myMessage(){
        return "This is my first message from controller !";
    }
}
