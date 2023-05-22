public class Encapsulation {
    public static void main(String[] args) {
        Person mike = new Person();
        mike.setName("Mike");
        mike.setAge(34);
    }
}

class Person{
    private String name;
    private int age;

    // Accessors (getters)
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    // Mutators (setters)
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
    }
}
