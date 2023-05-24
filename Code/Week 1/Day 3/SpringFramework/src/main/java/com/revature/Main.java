package com.revature;

import com.revature.afterdi.AppConfig;
import com.revature.beforedi.Address;
import com.revature.afterdi.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
Dependency Injection
Modularity
Separation of Concerns
 */

public class Main {
    public static void main(String[] args) {
//        Address address = new Address("Mayfield Road", 345);
//        Company company = new Company(address);

        // Spring container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Company company = context.getBean(Company.class);

        System.out.println(company);

    }
}