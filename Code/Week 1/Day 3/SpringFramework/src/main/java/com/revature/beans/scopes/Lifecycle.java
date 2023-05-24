package com.revature.beans.scopes;

public class Lifecycle {

    /*
    Bean Instantiation
        The spring container creates an instance of a bean based on its bean definition

    Dependency Injection
        After the bean is instantiated, the container performs dependency injection
        This is usually done through constructor or setter injection

    Initialization
        The container calls the beans init() method if it is there
        This is done through @PostConstruct or the interface of InitializingBean

    Usage
        The bean is now fully initilialized and can be used within the application

    Destruction
        The application is shut down and the bean is no longer needed. The destroy() method
        is now called if it exists

    Bean Garbage Collection
        Once a bean is destroyed, it becomes eligible for garbage collection by the JVM
     */

}
