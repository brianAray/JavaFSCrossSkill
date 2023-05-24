package com.revature.afterdi;

import com.revature.afterdi.Address;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Company {
    private Address address;

    private Employee employee;

    public Company(Address address, Employee employee){
        this.address = address;
        this.employee = employee;
    }

    // getters, setters, etc


    @Override
    public String toString() {
        return "Company{" +
                "address=" + address +
                ", employee=" + employee +
                '}';
    }
}
