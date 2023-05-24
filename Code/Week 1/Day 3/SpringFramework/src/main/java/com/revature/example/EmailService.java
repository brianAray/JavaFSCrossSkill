package com.revature.example;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

    @Override
    public String getMessage() {
        return "Email Message";
    }
}
