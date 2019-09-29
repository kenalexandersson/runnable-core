package com.kense.democustom.feature;

import com.kense.democore.feature.Greeting;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CustomGreetingService implements Greeting {

    @Override
    public String getGreeting() {
        return "Fucking hell!";
    }
}