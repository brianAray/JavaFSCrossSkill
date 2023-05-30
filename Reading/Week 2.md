# Spring / Spring Boot

1. MVC Architecture:
The Model-View-Controller (MVC) architecture is a popular design pattern for building web applications. In Spring Boot, you can follow the MVC pattern by organizing your code into separate components:

- Model: The model represents the data and business logic of the application. It includes entities, which are typically annotated with `@Entity` and map to database tables. DTOs (Data Transfer Objects) are used to transfer data between the backend and frontend, providing a simplified view of the entity. Service classes encapsulate the business logic and interact with the repositories.
- View: In Spring Boot, the view is typically implemented using templates or views such as Thymeleaf. The view is responsible for rendering the user interface and displaying the data received from the controller.
- Controller: Controllers receive requests from clients and handle the necessary processing. They map specific HTTP endpoints to methods using annotations like `@GetMapping`, `@PostMapping`, etc. Controllers invoke the corresponding business logic in the service layer, retrieve data from the database, and prepare a response to be sent back to the client.

Resources:

- https://www.baeldung.com/spring-mvc-tutorial
- https://www.javatpoint.com/spring-mvc-tutorial

- You do not need to be able to create an application using purely Spring MVC, but you should be able to explain the key aspects of it.
- This includes the flow of Spring MVC, the architecture of a Model-View-Controller, and the annotations related to it.

2. Spring Boot:
Spring Boot is a framework that simplifies the setup and configuration of Spring-based applications. It provides defaults and auto-configurations, allowing you to focus on writing business logic rather than boilerplate code. Spring Boot features include:

- Dependency Management: Spring Boot simplifies dependency management by providing a set of curated starters. Starters are dependencies that include all the necessary libraries and configurations to kickstart specific functionalities in your application. By including a starter in your project's configuration, Spring Boot automatically manages the required dependencies and their versions.
- Auto-Configuration: Spring Boot features auto-configuration, which automatically configures various components based on the classpath dependencies and sensible defaults. It eliminates the need for explicit configuration by inferring the desired behavior based on the libraries present in your project. Auto-configuration reduces boilerplate code and allows you to focus on writing application logic rather than complex configuration.
- Embedded Server: Spring Boot includes an embedded server, such as Tomcat or Jetty, which allows you to run your application as a standalone executable. The embedded server eliminates the need to deploy your application to external servers during development, making it easy to test and run your application locally. The server is configured automatically by Spring Boot, and you can customize its behavior as per your requirements.

Resources:
- Guide for RESTFul API with Spring Boot
    - https://spring.io/guides/gs/rest-service/
- Consuming RESTful services with Spring Boot
    - https://spring.io/guides/gs/consuming-rest/
- Testing the Spring Web Layer
    - https://spring.io/guides/gs/testing-web/

3. Spring Data JPA:
Spring Data JPA provides a convenient way to interact with databases using the Java Persistence API (JPA) and Hibernate. It simplifies database operations by generating queries based on method names and annotations. Key concepts in Spring Data JPA include:

- Entities: In Spring Data JPA, entities represent the objects that are mapped to database tables. An entity class is annotated with `@Entity` to indicate that it represents a table in the database. Each field or property in the entity class typically maps to a column in the table. Additionally, you can use annotations such as `@Id` to specify the primary key field and `@GeneratedValue` to define the strategy for generating primary key values.
- Mulitplicity: 
    - One-to-Many (1:N): In a one-to-many relationship, an instance of one entity is associated with multiple instances of another entity. However, each instance of the second entity is associated with only one instance of the first entity. For example, consider a Department entity and an Employee entity. A department can have multiple employees, but each employee belongs to only one department. JPA provides annotations like `@OneToMany` and `@ManyToOne` to define this relationship.
    - Many-to-One (N:1): The many-to-one relationship is the inverse of a one-to-many relationship. In this case, multiple instances of one entity are associated with a single instance of another entity. For example, multiple employees can belong to the same department. 
    - Many-to-Many (N:N): In a many-to-many relationship, multiple instances of one entity are associated with multiple instances of another entity, and vice versa. For example, consider a Student entity and a Course entity. A student can enroll in multiple courses, and a course can have multiple students. In JPA, you can define a many-to-many relationship using annotations like `@ManyToMany`.
- Repositories: Repositories in Spring Data JPA provide a high-level abstraction for performing database operations. You can create a repository interface by extending `JpaRepository<T, ID>`, where `T` is the entity class and `ID` is the type of the entity's primary key. The repository interface provides methods for common database operations, such as querying, saving, updating, and deleting entities. You don't need to write explicit SQL queries; Spring Data JPA generates the necessary queries based on the method names and JPA annotations.

Resources:

- Spring Data JPA Guides
    - https://spring.io/guides/gs/accessing-data-jpa/
- Spring Data JPA Examples
    - https://github.com/spring-projects/spring-data-examples/tree/main/jpa

4. Spring Data Annotations:
Spring Data provides several annotations to enhance JPA entities and repositories:

- `@Entity`: Marks a class as an entity.
- `@Table`: Specifies the name of the table associated with an entity.
- `@Id`: Indicates the primary key field of an entity.
- `@GeneratedValue`: Specifies the strategy for generating primary key values.
- `@Column`: Maps a field to a column in the database.

5. Spring Boot Actuator:
Spring Boot Actuator provides production-ready features to monitor and manage your application. It exposes endpoints that offer insights into your application's health, metrics, configurations, and more. Actuator features include:

- Health Indicators: Check the health of your application and its dependencies.
- Metrics: Gather various application and system metrics.
- Configuration: Access and modify configuration properties at runtime.
- Auditing: Record information about HTTP requests handled by your application.

Resources:

- Guide to making RESTful services with Spring Actuator
    - https://spring.io/guides/gs/actuator-service/
