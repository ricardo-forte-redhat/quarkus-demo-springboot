package com.redhat.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name + " from springboot";
    }
}