package com.example.RestTemplateExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
    private final RestTemplate restTemplate;

    @Autowired
    public MyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String consumeWebService() {
        String url = "http://localhost:8080/accounts/1"; 

        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
