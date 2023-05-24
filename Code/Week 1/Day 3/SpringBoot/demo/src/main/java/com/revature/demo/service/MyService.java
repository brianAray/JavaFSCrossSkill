package com.revature.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    /*
    There are 3 ways to autowire dependencies

    Constructor Injection
        Dependencies are provided through a constructor parameter
        It promotes immutability and esnures that all required dependencies are available when an object is created
        Put the @Autowired above the constructor to set it as constructor injection

    Field Injection
        In field injection, the dependencies are directly injected into the class fields
        It is simpler and more concise, however, it makes testing and refactoring more challenging
        Put the @Autowired above the field

    Setter Injection
        Using setters to inject dependencies instead of constructors
        Setter injection allows for optional dependencies and facilitates changing dependencies during runtime
        Put the @Autowired above a setter for the dependency

     */

    private final MyDependency myDependency;

    @Autowired
    public MyService(MyDependency myDependency){
        this.myDependency = myDependency;
    }

//    @Autowired
//    public void setMyDependency(MyDependency myDependency){
//        this.myDependency = myDependency;
//    }

    public String doThing(){
        return "Hello this is the number you were thinking: " + myDependency.returnANumber();
    }

}
