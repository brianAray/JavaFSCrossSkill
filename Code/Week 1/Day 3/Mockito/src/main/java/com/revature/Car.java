package com.revature;

public class Car {

    public Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public int drive(){
        this.engine.ignite();
        return 5;
    }
}
