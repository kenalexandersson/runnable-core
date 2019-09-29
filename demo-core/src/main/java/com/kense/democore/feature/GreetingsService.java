package com.kense.democore.feature;

import org.springframework.stereotype.Service;

@Service
public class GreetingsService implements Greeting {

    @Override
    public String getGreeting() {
        return "Hello from the core application";
    }
}
