package com.revature.demo.service;

import org.springframework.stereotype.Component;

@Component
public class MyDependency {

    public int returnANumber(){
        return 10;
    }
}
