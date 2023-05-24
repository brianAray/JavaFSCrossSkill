package com.revature.afterdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.revature.afterdi")
public class AppConfig {

    @Bean
    public Address address(){
        return new Address("High Road", 1000);
    }

    @Bean
    public Employee employee(){
        return new Employee("Mike");
    }

    @Bean
    public Company company(){
        return new Company(address(), employee());
    }
}
