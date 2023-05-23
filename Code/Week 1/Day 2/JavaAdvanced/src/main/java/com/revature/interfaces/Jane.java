package com.revature.interfaces;

public class Jane implements Person, Doctor{
    @Override
    public void speak(String message) {
        System.out.println("Jane says: " + message);
    }

    @Override
    public void walk() {
        System.out.println("Jane goes for a walk");
    }

    @Override
    public void eat(String food) {
        System.out.println("Jane eats: " + food);
    }

    @Override
    public void diagnose(String[] symptoms) {
        System.out.println("Jane says: You are ill");
    }
}
