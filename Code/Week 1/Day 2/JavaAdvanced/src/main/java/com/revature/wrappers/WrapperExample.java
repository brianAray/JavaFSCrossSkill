package com.revature.wrappers;


import java.util.Arrays;

/*
Wrapper classes are a set of classes that wrap the primitive data types and provide additonal functionality.
Wrapper classes allow primtive types to be treated as objects, enabling them to be used in scenarios that require objects
    - collections
    - generics
    - method overloading


Autoboxing and Unboxing

Java provides automatic conversion between primitive types and their corresponding wrapper classes, known as autoboxing and unboxing
Autoboxing automatically converts a primitve type to its corresponding wrapper class
Unboxing automatically converts a wrapper class object to its corresponding primitive type
 */
public class WrapperExample {

    public static void main(String[] args) {
        int intNum = 10;
        Integer integerNum = 10;

        String str = integerNum.toString(); // Convert Integer to String
        int intValue = integerNum.intValue(); // convert Integer to int

        System.out.println(str); // "10"
        System.out.println(intValue); // 10

    }
}
