package com.revature.afterdi;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;
    private int number;

    public Address(String street, int number){
        this.street = street;
        this.number = number;
    }

    // getters and setters etc


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
