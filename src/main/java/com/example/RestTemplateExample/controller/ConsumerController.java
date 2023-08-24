package com.example.RestTemplateExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestTemplateExample.service.MyService;

@RestController
public class ConsumerController {
    private final MyService myService;

    public ConsumerController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/consume")
    public String consumeWebService() {
        return myService.consumeWebService();
    }
}
