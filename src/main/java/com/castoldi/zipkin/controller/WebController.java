package com.castoldi.zipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired 
    RestTemplate restTemplate;
    
    @GetMapping("/")
    public String helloWorld() {
        return "<h1>Hello at " + System.currentTimeMillis() + "!</h1>";
    }

    @Bean 
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
