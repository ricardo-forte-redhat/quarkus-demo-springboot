package com.redhat.demo.serasa;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name;
    }
}