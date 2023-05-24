package com.revature.example;

import org.springframework.stereotype.Component;

@Component
public class PhoneService implements MessageService{
    @Override
    public String getMessage(){
        return "Phone Message";
    }
}
