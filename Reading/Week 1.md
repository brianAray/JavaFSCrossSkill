# Java / Git / AWS / Maven

1. Java Language Fundamentals:
    - Syntax: Java follows a syntax similar to other C-style languages. It uses semicolons to terminate statements and curly braces to define blocks of code. Variables are declared with a specific data type and can be assigned values using operators.
    - Data Types: Java has both primitive data types (e.g., int, double, boolean) and reference data types (e.g., classes, arrays). Primitive types hold basic values, while reference types refer to objects in memory. 
    - Control Flow: Java provides various control flow mechanisms for making decisions and repeating actions. It includes if-else statements for conditional branching, switch statements for multi-branch decisions, and loops such as for, while, and do-while for iteration. Exception handling using try-catch blocks allows the handling of exceptional situations gracefully.
    - Object-Oriented Programming (OOP) Principles: Java is an object-oriented programming language, and OOP principles are at its core. Encapsulation enables bundling data and methods together in classes. Inheritance allows classes to inherit properties and behaviors from parent classes. Polymorphism enables objects to take multiple forms based on their context. Abstraction provides the ability to define abstract classes and interfaces, allowing for the specification of common behavior.

2. Spring Framework:
    - Dependency Injection (DI): Spring's Dependency Injection is a design pattern that allows the dependencies of a class to be injected rather than created manually within the class. This approach reduces tight coupling between components and promotes modularity, maintainability, and testability. By decoupling dependencies, it becomes easier to manage and replace them when needed.
    - Inversion of Control (IoC): Inversion of Control is a principle underlying Dependency Injection. It refers to the shift of control from objects creating and managing their dependencies to an external entity. In the case of Spring, the IoC container takes charge of creating and managing objects, allowing components to be loosely coupled and promoting modular application design.
    - Spring Core: Spring Core provides the foundational features of the Spring Framework, including Dependency Injection (DI) and Inversion of Control (IoC). It includes the IoC container that manages object creation, wiring, and lifecycle management of Spring components. Spring Core is the backbone of the Spring Framework.
    - Spring Boot: Spring Boot is a subproject of the Spring Framework that simplifies the configuration and development of Spring applications. It includes auto-configuration, which automatically configures various components based on classpath dependencies and sensible defaults. Spring Boot also provides an embedded server, eliminating the need for deploying applications to external servers. It offers production-ready features and streamlines the development process.
    - Spring MVC: Spring MVC (Model-View-Controller) is a module of the Spring Framework that facilitates building web applications following the MVC architectural pattern. It provides features for request handling, view resolution, and data binding. Spring MVC allows developers to create flexible and scalable web applications.
    - Spring Data: Spring Data simplifies data access by providing a consistent and convenient API for working with different data sources, such as relational databases (e.g., MySQL, PostgreSQL) and NoSQL databases (e.g., MongoDB). It offers a set of abstractions and tools for database operations, including CRUD operations, query generation, and transaction management.
    - Spring Security: Spring Security is a module that handles authentication, authorization, and other security-related features in Spring applications. It provides a comprehensive security framework for securing web applications and APIs, supporting features like user authentication, role-based access control, and protection against common security threats.

3. Git:
    - Git is a distributed version control system (VCS) used for tracking changes in source code during software development. It allows collaboration among multiple developers, version control, branching, merging, and more.

Resources:
- Learn Git Branching, online game to practice git branching visually and with the commands
    - https://learngitbranching.js.org

4. AWS (Amazon Web Services):
    - AWS is a cloud computing platform that offers a wide range of services and tools for building and deploying applications. It provides scalable and flexible infrastructure resources, storage options, database services, networking capabilities, and more.
    - It offers various storage options, including object storage (Amazon S3), block-level storage (Amazon EBS), and archival storage (Amazon Glacier).
    - AWS includes managed database services like Amazon RDS, Amazon DynamoDB, and Amazon Redshift.
    - It provides networking capabilities such as Amazon VPC for creating isolated virtual networks.
    - AWS offers deployment and management tools like AWS Elastic Beanstalk, AWS CloudFormation, and AWS OpsWorks.
    - Security and compliance are prioritized, with features like IAM, encryption services, and adherence to industry standards.
    - AWS has a global infrastructure with data centers in multiple regions.

5. Java Collections:
    - Java Collections framework provides classes and interfaces to store, manipulate, and process collections of objects. It includes List, Set, Queue, and Map implementations, along with utility classes for sorting, searching, and manipulating collections.
    - List represents an ordered collection that allows duplicate elements.
    - Set represents an unordered collection that does not allow duplicate elements.
    - Queue represents a collection designed for holding elements prior to processing.
    - Map represents a collection of key-value pairs, where each key is unique.
    - The framework provides utility classes for sorting, searching, and manipulating collections.
    - It offers algorithms for operations like sorting elements, finding minimum and maximum values, and reversing collections.
    - The Collections class provides static methods for common operations on collections, such as finding the frequency of an element or finding the intersection between two collections.

Resources:

- Information:
    - https://www.geeksforgeeks.org/collections-in-java-2/

6. TDD and Unit Testing:
    - Test-Driven Development (TDD) is a software development approach where tests are written before the actual implementation. It promotes writing tests to validate the desired behavior and then writing code to make the tests pass. Unit testing is a key aspect of TDD, where individual units (e.g., methods, classes) are tested in isolation.

7. Maven:
    - Maven is a build automation tool for Java projects. It manages dependencies, compiles source code, runs tests, and packages the application into an executable format. Maven uses a declarative XML-based configuration.

8. Unix Commands:
    - Unix commands are used in Unix-based operating systems (e.g., Linux, macOS) for executing various tasks. Common commands include navigating the file system (`cd`, `ls`), manipulating files and directories (`cp`, `mv`, `rm`), and executing programs.