package com.revature.functional;

import java.util.function.Predicate;
import java.util.function.Function;

/*
A functional interface is an interface that has exactly one abstract method
It is referred to as SAM (Single Abstract Method) interfaces
Java provides the @FunctionalInterface annotation to indicate that an interface is intended to be functional

To instantiate or use a functional interface, we need a lambda

There are some premade functional interfaces available:
    - Predicate
    - Function
    - Consumer
    - Supplier
    - etc


Lambdas

They are a concise way to represent an anonymous class, ( a class without a name) that can be passed around
as a method parameter or assigned to a variable

Syntax
(arguments) -> expression

(arg1, arg2, arg3) -> {
return arg1 + arg2 + arg3;
}
 */
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Wrapper classes instead of primitives
        Predicate<Integer> isEven = (number) -> number %2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(2345234));


        Function<String, Integer> stringLength = (str) -> str.length();

        String input = "Hello, WOrld!";

        System.out.println(stringLength.apply(input));
    }
}
