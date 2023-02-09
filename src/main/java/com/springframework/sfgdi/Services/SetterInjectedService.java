package com.springframework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - Setter";
    }
}
