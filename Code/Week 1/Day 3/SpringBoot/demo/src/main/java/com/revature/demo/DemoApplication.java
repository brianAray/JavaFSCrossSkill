package com.revature.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	Spring Boot is a framework built on top of the SPring framework, its goal is to simplify development of Java Apps

	It provides a streamlined, albeit opinionated approach to building production ready applications with minimal configuration

	1. Autoconfiguration
		Sprign boot offers automatic configuration based on convention over configuration principles
		It analyzes the classpath and dependencies to configure various components, reducing the need for manual configuration

	2. Standalone Applications
		Spring boot allow syou to create standalone applications that can be run with a command line invocation
		It embedds a servlet container (Tomcat) or an embedded reactive web server (Netty) for running web applications

	3. Opinionated Defaults
		Spring boot provides a sensible default configuration for various components and technologies, like web frameworks or logging
		Minimizes the need for manual configuration and reduces time required to setup a project
		Developers can override or customize the defaults based on their specific requirements

	4. Spring Boot Starters
		Starters are a key feature of SPring Boot that simplify the inclusion of dependencies and configuration
		They provide a convenient way to add dependencies and specific functionality to a Spring Boot Project like Messaging, or Security

	5. Production Ready Features
		Spring boot provides production ready features like health checks, metrics, and monitoring

	6. Spring Boot Actuator
		Provides endpoints and tools for monitoring and managing applications at runtime


	Advantages over Spring

	Simplified Configuration
		Spring Boots opinionated defaults and autoconfiguration reduce the need for manual configuration
		Eliminates the requirement to write XML configurations
		We can get started without having to write boiler plate code

	Rapid Application Development
		Spring boot promotes rapid development by providing a series of features all benefiting quick and simplified development
		Creating standalone applications without needing to bring in additional technologies like web servers

	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
