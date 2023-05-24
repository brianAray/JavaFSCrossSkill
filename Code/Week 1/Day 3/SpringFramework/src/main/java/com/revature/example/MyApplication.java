package com.revature.example;

import org.springframework.stereotype.Component;

@Component
public class MyApplication {

    private MessageService messageService;

    public MyApplication(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendNotification(){
        String message = messageService.getMessage();
        System.out.println("Sending Notification: " + message);
    }
}
