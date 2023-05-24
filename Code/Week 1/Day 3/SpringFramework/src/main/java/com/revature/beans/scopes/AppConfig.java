package com.revature.beans.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.revature.scopes")
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
