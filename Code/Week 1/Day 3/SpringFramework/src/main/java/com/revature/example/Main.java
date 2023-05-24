package com.revature.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Create the spring container
        ApplicationContext context = new AnnotationConfigApplicationContext(PhoneAppConfig.class);

        // Retrieve the instance of MyApplication from the container
        MyApplication myApplication = context.getBean(MyApplication.class);

        // Use the application
        myApplication.sendNotification();
    }
}
