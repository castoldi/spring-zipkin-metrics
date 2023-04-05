package com.castoldi.zipkin.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.castoldi.zipkin.service.IProcess1Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class WebController {
	
	private final IProcess1Service testService;
    
    @GetMapping("/")
    public String helloWorld() {
    	testService.process1();
        return "<h1>Hello at " + System.currentTimeMillis() + "!</h1>";
    }

    @Bean 
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
