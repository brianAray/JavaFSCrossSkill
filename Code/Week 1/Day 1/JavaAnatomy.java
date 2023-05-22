// package declaration
// package com.example.myprogram

/*
 * A java program can be organized into packages
 * These are a way to categorize and group related classes
 * The package declaration is optional but it should be at the top of the java file
*/

// Import statements
/*
 * These are used to bring in classes from other packages into the current program
 * They allow you to acces classes without specifying their fully qualified name
 * 
 * com.example.myprogram.classes.Robot
 * com.example.myprogram.Robot
 * 
 * with the import statement you can do this:
 * 
 * import com.example.myprogram.*;
 * import com.example.myprogram.classes.*;
 * 
 * main(){
 *  
 * }
 */


/*
 * Class Declarations
 * 
 * Every java program consists of at least one class
 * The class declaration defines the blueprint of the calss, includign its name, access modifiers, and body
 */

public class JavaAnatomy {

    /*
     * Class body
     */

     /*
      * Main Method
        the main method is the entry point of a Java program
        It acts as the starting point for execution of the program
      */

      public static void main(String[] args) {
        // Program begins execution here

        JavaAnatomy greg = new JavaAnatomy(0, "Greg");
      }
    
      /*
       * Class Members
       * Fields (variables)
       * Methods
       * Constructors
       * Nested Classes
       */

    //fields
    private int age;
    private String name;

    private InnerClass innerClass;

    // Methods
    public void printInfo(){
        System.out.println("name: " + this.name + ", Age: " + this.age);
    }

    // Constructor
    // No args
    public JavaAnatomy(){
        this.age = 28;
        this.name = "John Doe";
    }

    // All args
    public JavaAnatomy(int age, String name){
        this.age = age;
        this.name = name;
        this.innerClass = new InnerClass();
    }

    // Nested Class

    private static class InnerClass{
        // inner class definition
    }
}
