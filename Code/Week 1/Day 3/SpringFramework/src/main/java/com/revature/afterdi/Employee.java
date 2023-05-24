package com.revature.afterdi;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;

    public Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
