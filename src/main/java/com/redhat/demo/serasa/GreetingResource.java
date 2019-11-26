package com.redhat.demo.serasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class GreetingResource {

    @Autowired
    GreetingService greetingService;

    @GetMapping( "/springboot/hello" )
    @ResponseStatus( OK )
    @ResponseBody
    public String hello() {
        return this.greetingService.greeting("spring-boot customer");
    }

    @GetMapping( "/springboot/serverinfo" )
    @ResponseStatus( OK )
    @ResponseBody
    public String serverInfo(HttpServletRequest req) {
        return "hello from spring-boot running at: "
                + req.getServerName() + " - " + req.getLocalAddr();
    }
}