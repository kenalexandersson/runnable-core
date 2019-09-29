package com.kense.democore.web;

import com.kense.democore.feature.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private Greeting greeting;

    @Autowired
    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return greeting.getGreeting();
    }
}
