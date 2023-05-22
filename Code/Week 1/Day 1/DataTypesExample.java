public class DataTypesExample {
    public static void main(String[] args){
        // primitive data types
        byte bite = 1;
        short shortNum = 2;
        int age = 30;
        long longNum = 34234234234L;
        float floatNum = 23.34f;
        double height = 1.75;
        char character = 'a';
        boolean bool = true;
        
        // reference data types
        String name = "John";
        int[] numbers = {1, 2, 3, 4};
        int[] numbers2 = {1, 2, 3, 4};
        Person person = new Person(name);

        System.out.println(name);
        System.out.println(numbers[3]);
        System.out.println(numbers2[2]);
        System.out.println(person.name);

        Person jane = new Person("Jane");
        Person Mike = new Person("Mike");
        Person Josh = new Person("Josh");
        Person Mildred = new Person("Mildred");
        
        Person.SaySomething("Hi there");
        Person.WhatSpecies();
        Mildred.WhatSpecies();

    }
}

class Person {

    String name;
    public static String species = "Homo Sapien";

    public static void SaySomething(String message){
        System.out.println(message);
    }

    public static void WhatSpecies(){
        System.out.println(species);
    }

    public Person(String name){
        this.name = name;
    }

}