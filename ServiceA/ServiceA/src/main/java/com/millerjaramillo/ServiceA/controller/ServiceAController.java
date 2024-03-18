package com.millerjaramillo.ServiceA.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/a")
public class ServiceAController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL
            ="http://localhost:8081/";

    //Nombre del disyuntor
    private static final String SERVICE_A = "serviceA";

    @CircuitBreaker(name = SERVICE_A, fallbackMethod = "serviceAFallback")
    @GetMapping
    public String ServiceA(){
        String url = BASE_URL + "b";
        return restTemplate.getForObject(
                url,
                String.class
        );

    }


    //Metodo alternativo
    public String serviceAFallback(Exception e){

        return  "This is a fallback method for Service A";

    }
}
