package com.revature;

import com.revature.interfaces.Doctor;
import com.revature.interfaces.Jane;
import com.revature.interfaces.Person;

public class Main {
    public static void main(String[] args) {
        Doctor jane = new Jane();
        ((Person) jane).walk();
    }
}