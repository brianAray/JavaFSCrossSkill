package com.revature.SpringDataJPA;

import com.revature.SpringDataJPA.entity.Order;
import com.revature.SpringDataJPA.entity.User;
import com.revature.SpringDataJPA.service.OrderService;
import com.revature.SpringDataJPA.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);

//		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
//
//		UserService userService = context.getBean(UserService.class);
//		OrderService orderService = context.getBean(OrderService.class);

		// create a new user
//		User user = new User();
//		user.setName("John Doe");
//		user.setEmail("john.doe@email.com");


//		// save user
//		userService.saveUser(user);
//
//		// retrieve a user by ID
//		Long userId = user.getId();
//		Optional<User> retrievedUser = userService.getUserById(1L);
//		retrievedUser.ifPresent(System.out::println);
//
//		// create a new order
//		Order order = new Order();
//		order.setUser(retrievedUser.get());
//		order.setDescription("Cheese Burger");
//
//		// save order
//		orderService.saveOrder(order);
//
//		// retrieve by name
//		List<User> usersByName = userService.findByName("John Doe");
//		usersByName.forEach(System.out::println);
//
//
//		// get all orders
//		List<Order> allOrders = orderService.getAllOrders();
//		allOrders.forEach(System.out::println);


		// Get all users
//		List<User> allUsers = userService.getAllUsers();
//		allUsers.forEach((userFound) -> System.out.println(userFound));
//
//		// delete a user
//		userService.deleteUser(userId);
//
//		// Check if the user is deleted
//		Optional<User> deletedUser = userService.getUserById(userId);
//		System.out.println("Is user deleted?? " + !deletedUser.isPresent());

	}

}

/*
SPring Data JPA is a part of the Spring Data Project that simplifies the data access layer in Java using
the Java Persistence API

It provides a set of abstractions and convenient features to interact with databases, perfrom CRUD operations, and
execute complex queries

1. Entity Classes
	- Entity classes represent the objects that will be stored in the database
	- Annotated with @Entity
	- Entity classes map to database tables and define the structure of the data

2. Repository Interfaces
	- Repository interfaces extended with JpaRepository or other Spring Data repository interfaces that define the CRUD operations
	  for a specific entity
	 - They provide high-level common methods for database operations, such as save(), findById(), findAll(), deleteById(), etc
	 - They can also define custom query methods using method naming conventions or annotated queries

3. Automatic Query Generation
	- Spring Data JPA can automatically generate queries based on method names defined in the repository interfaces
	- Query generation relies on naming ocnventions, allowing you to define complex queries by simply naming your repository methods
	-
4. QueryDSL and CriteriaAPI
5. Pagination and Sorting
6. Transaction Management
7. Auditing
 */
