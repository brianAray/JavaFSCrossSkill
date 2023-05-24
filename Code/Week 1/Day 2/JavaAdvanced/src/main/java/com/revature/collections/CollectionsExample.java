package com.revature.collections;

/*
Lists
Maps
Sets

Collection Hierarchy

Collection interface
The root of the hierarchy
Defines basic operations that are common to all types of collections like adding, removing, iterating

List interface
Extends collection interface and represents an ordered collection of elements
Allows duplicates and provides positional access to elements (indexing)

Set interface
Extends teh collections interface, representing an unordered collection of unique elements
Does not allow duplicates

Queue interface
Extends the collection interface, and represents a collection designed for holding elements prior to processing
It follows the FIFO principle (First In First Out)

Map Interface
Map interface represents a mapping between keys and values
It does not extends the collection interface
Each key in a map must be unique, and it is associated with a value.
*/

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Array list
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);

        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");

        String name = names.get(0);

        numbers.set(0, 234234);

        numbers.remove(0);

        // useful methods that are not basic
        numbers.size(); // number of elements
        numbers.isEmpty(); // is the collection empty
        numbers.contains(1234); // check if this is inside the collection


        // LinkedList
        LinkedList<String> linkedNames = new LinkedList<>();
        linkedNames.add("Mike"); // adding single element
        linkedNames.add("Greg");

        linkedNames.addFirst("Jane"); // adding elmetn to the beginning
        linkedNames.addLast("Bob"); // adding element to the end

        String element = linkedNames.get(0);

        linkedNames.set(0, "Michelle");

        linkedNames.remove(); // remove the first element
        linkedNames.remove(2);
        linkedNames.removeFirst();
        linkedNames.removeLast();

        // Useful methods
        String name1 = linkedNames.pollFirst(); // remove and retrieve the first element
        String name2 = linkedNames.pollLast(); // remove and retrieve the last element

        // Linked lists are useful when you have to frequently add or remove elements
        // it is highly efficient at inserting or deleting elements at both ends

        // array lists are efficient at indexing positions, much more than linked lists


        // Hash Maps
        // HashMap<KeyType, ValueType>
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Mike", 44); // adds a key value pair
        map.put("Greg", 22);

        Integer value = map.get("Mike"); // Accessing value associated with "Mike"

        map.put("Mike", 45); // modify an entry by putting on the same key
        map.remove("Mike");


        // Hash Set
        HashSet<Integer> set = new HashSet<>();

        set.add(234);
        set.add(234); // it simply will not add this

        set.remove(234);

        set.add(322);

        boolean exists = set.contains(322);

        System.out.println(set);

        // HashSet is efficeint for checking for element existence and performing set operations
        // It does not maintain the order of elements

    }
}
