package com.revature.demo.controller;

import com.revature.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Goodbye!";
    }

    @GetMapping("/service")
    public String doService(){
        return myService.doThing();
    }

}
