package com.revature.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.revature.example")
public class PhoneAppConfig {

    @Bean
    public MessageService phoneService(){
        return new PhoneService();
    }

    @Bean
    public MyApplication myApplication(PhoneService messageService){
        return new MyApplication(messageService);
    }
}
