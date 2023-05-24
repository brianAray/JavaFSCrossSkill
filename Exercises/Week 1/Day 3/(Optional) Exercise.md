# Create a Student Management Web API

This is an optional exercise to work with Spring MVC. Spring MVC is an important part of the web methods of Spring, but we will be using Spring boot for the majority of this.
Use this exercise as an opportunity to work with Spring MVC to become more familiar with the tool.

## Task

Create a Spring application to manage student records. Implement a Student class with properties like id, name, and grade. Use dependency injection to inject the StudentService into the StudentController for managing student operations.

## Starter Code

### Student Class

```java
public class Student {
    private String id;
    private String name;
    private int grade;

    // Constructor, getters, and setters
}
```

### StudentService interface

```java
public class Student {
    private String id;
    private String name;
    private int grade;

    // Constructor, getters, and setters
}
```

### StudentServiceImpl class

```java
public class StudentServiceImpl implements StudentService {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(String id, Student student) {
        // Implement the update logic based on the student id
    }

    @Override
    public void deleteStudent(String id) {
        // Implement the delete logic based on the student id
    }

    @Override
    public Student getStudent(String id) {
        // Implement the logic to get a student based on the id
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
```

### StudentController Class

```java
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Implement the controller methods for handling student operations
}
```

### AppConfig Class

```java
@Configuration
@ComponentScan(basePackages = "INPUT PACKAGE WHERE BEAN CLASSES ARE")
public class AppConfig {

    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl();
    }

    @Bean
    public StudentController studentController(StudentService studentService) {
        return new StudentController(studentService);
    }
}
```

### MainApplication Class

```java
public class MainApplication {
    public static void main(String[] args) {
        // Create the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the student controller bean from the application context
        StudentController studentController = context.getBean(StudentController.class);

        // Use the student controller to manage student operations
    }
}
```

Your task is to implement the remaining logic in the StudentService and StudentController classes to handle student operations such as adding, updating, deleting, and retrieving students. Use dependency injection to inject the StudentService into the StudentController for managing student operations.

Note: Make sure you have the necessary Spring framework dependencies added to your project, such as spring-context and spring-webmvc, and configure component scanning in your application to detect the Spring components.
