package com.revature.interfaces;

public interface Person {

    /*
    An interface in Java is a collection of abstract methods
    It provides a contract that speicifes the behaviors a class must implement
    Interfaces are declared using the interface keyword


    Key characteristics
    An interface cannot be instantiated; it is only a blueprint for classes to follow
    A class can implement multiple interfaces
    All methods declared in an interface are implicitly public and abstract
    From Java 8, interfaces can also contain static and default methods
     */

    void speak(String message);

    void walk();

    void eat(String food);

}
