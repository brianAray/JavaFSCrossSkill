package com.revature.generics;

import java.util.Collection;

/*
Generics in Java provide a way to define classes, interfaces, and methods that can work with different data types
They enable the creation of reusable and type-safe code by allowing the specification of type parameters
Generics allow parameterization with type placeholders
The type placeholders are represented by a single uppercase letter conventionally named: T, E, K, or V


Class level generics
- generics used to create generic classes that can work with different data types
- type parameters are specified within angle brackets after the class name
 */
public class MyGenericClass<T>{

    private T data;

    public MyGenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    // Method level generics
    /*
        - Generics can also be used at the method level to create generic methods
        - the type parameter is specified before the return type of the method
     */

    public <U> void myGenericMethod(U item){
        System.out.println("Data: " + this.data);
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        MyGenericClass<Integer> intObj = new MyGenericClass<>(435);
        MyGenericClass<String> stringObj = new MyGenericClass<>("Hello");

        int intData = intObj.getData();
        String stringData = stringObj.getData();

        intObj.myGenericMethod("String value");
        stringObj.myGenericMethod(34.34F);
    }

    /*
    In this example, MyGenericClass is a generic class that takes a type parameter of T
    It has a constructor that accepts an argument of type T and a getter method that returns the stored data
    The class has a generic method MyGenericMethod that accepts a type parameter of U and prints the stored
    data along with the passed item.

    We are instantiating this generic class with the angle brackets next to the type of the class
    MyGenericClass<Integer>
    MyGenericClass<String>
    MyGenericClass<Person>
     */

}
