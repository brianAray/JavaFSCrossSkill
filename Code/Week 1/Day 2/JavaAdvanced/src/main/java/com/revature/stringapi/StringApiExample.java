package com.revature.stringapi;


/*
String API in Java provides a set of methods and fucntionalites for working with Strings
These are sequences of char arrays.
Java treats strings as objects rather than primitives

Primitives are basic data types built into the java language. They are stored directly in memory and have a fixed size
Strings are objects of the String class in Java. They are reference types and store a sequence of characters

Strings are immutable, meaning that once a string object is created, its value cannot be modified. Any operation that
seems to modify a string actually is creating a new string object



The String Pool

The string pool is a specific area in memory in the Java heap where String literals are stored
When you create a string using a string literal (i.e. "hello") java checks if an identical string already exists in the string pool
If the string does not exist, a new string object is created in the pool
If the string already exists, java returns a reference to the existing object instead of creating a new one
String literals are automatically "interned" (adding to the pool) by the Java compiler.
If you use the new keyword when creating a String object, then it will not be interned by default


 */
public class StringApiExample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // Output : true (both reference the same object from the string pool)
        System.out.println(str1 == str3); // Output : false (new object is created with the new keyword)

        String str4 = str3.intern(); // Manually interning the string
        System.out.println(str1 == str4); // Output: true (after interning, both reference the same object from the string pool)
    }
}
