package com.revature.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.revature.example")
public class EmailAppConfig {

    @Bean
    public MessageService emailService(){
        return new EmailService();
    }

    @Bean
    public MyApplication myApplication(EmailService messageService){
        return new MyApplication(messageService);
    }
}
