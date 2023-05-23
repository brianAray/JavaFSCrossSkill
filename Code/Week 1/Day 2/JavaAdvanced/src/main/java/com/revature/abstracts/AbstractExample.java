package com.revature.abstracts;

public class AbstractExample {

    /*
    Use Interfaces when:

    You want to define a contract that multiple unrelated classes should follow
    When you want to achieve multiple inheritance-like behavior
    When you want to provide a common behavior to unrelated classes

    When to use abstract classes?

    When you want to provide a base implementation for related classes
    When you want to define abstract methods along with non-abstract methods
    When you want to share code and define common behavior among subclasses
     */
}

abstract class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
