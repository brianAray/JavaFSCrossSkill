public class StudentTeacherClasses {
    public static void main(String[] args) {
        // Creating a student object
        Person student = new Student("John Doe", 20, "S1234");
        student.displayDetails();

        System.out.println();

        // Creating teacher object
        Person teacher = new Teacher("Jane Doe", 35, "T1234124");
        teacher.displayDetails();
    }
}

// Abstract Classes
abstract class Person{
    protected String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void displayDetails();

    // Getters and Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

// Student class inherit from Person
class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }

    // Implementation of abstract method
    @Override
    public void displayDetails(){
        System.out.println("Student name: " + super.name);
        System.out.println("Age: " + super.getAge());
        System.out.println("Student ID: " + this.studentId);
    }
}

// Access Modifiers
// Private -> Public
// private, protected, default, public

class Teacher extends Person{
    private String employeeId;

    // Constructor
    public Teacher (String name, int age, String employeeId){
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void displayDetails(){
        System.out.println("Teacher name: " + super.name);
        System.out.println("Age: " + super.getAge());
        System.out.println("Teacher ID: " + this.employeeId);
    }
}