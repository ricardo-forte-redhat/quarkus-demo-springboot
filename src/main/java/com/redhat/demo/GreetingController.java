package com.redhat.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping( value = "/springboot" )
public class GreetingController {

    private final GreetingService service;

    @Autowired
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping( "/greeting/{name}" )
    @ResponseStatus( OK )
    @ResponseBody
    public String greeting( @PathVariable String name ) {
        return this.service.greeting( name );
    }

    @GetMapping
    @ResponseStatus( OK )
    @ResponseBody
    public String hello() {
        return "hello from springboot";
    }
}