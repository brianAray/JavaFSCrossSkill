package com.revature.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerExample {

    /*
    @SpringBootApplication
        Used at the entry point of the Spring boot application
        Combines the @Configuration @EnableAutoConfiguration and @ComponentScan

    @Service
        Used to mark a class as a service component in the business layer of the application
        Serves as a specialization of the @Component annotation
        When component scanning is enabled, Spring boot will automatically detect and register theses classes as Spring Beans

    @Repository
        Used to marka  class as a repository component
        Specialized @Component annotation
        Repositories are used to handle database operations, provide CRUD functionality, and encapsulate data access logic

    @Controller
        Controller component specialization
        Handling web requests
        Controllers define the request mapping methods to handle HTTP Requesets

    @RestController
        Annotation for RESTful controllers
        combines @Controller and @ResponseBody
        Simplifies the creation of RESTful endpoints by automatically converting return values to JSON or XML responses

    @RequestMapping
        annotation maps HTTP requests to controller methods
        Can be applied at the class level to define a base URL for all methods in a controller
        Can also be used at the method level to speicify the URL path and HTTP method for handling specific requests

    @GetMapping, @PostMapping, @PutMapping, @DeleteMapping are just specialized versions of @RequestMapping
     */

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/farewell")
    public String bye(@RequestParam String hello){
        return "Goodbye " + hello;
    }

}
