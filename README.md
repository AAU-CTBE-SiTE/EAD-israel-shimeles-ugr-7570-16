# Lab 4: Spring Core IoC and Bean Management

Student Name: Israel Shimeles  
Student ID: UGR/7570/16

This repository contains the implementation of the Spring Core Lab. The objective of this task is to demonstrate the Inversion of Control (IoC) principle, utilizing the Spring IoC Container to manage Java object creation, configuration, and dependency injection using both XML configuration and modern Annotation-based configuration.

## Task Requirements Map
According to the lab manual, the program satisfies the following criteria:
*   Configure a Spring IoC Container (ApplicationContext) to manage the lifecycle of beans.
*   Demonstrate Setter-Based Injection and Constructor-Based Injection.
*   Demonstrate Literal Dependency Injection (injecting primitive values like strings and numbers).
*   Demonstrate Object Dependency Injection (injecting one bean into another using ref or @Autowired).
*   Demonstrate Collection Dependency Injection (injecting a List of beans).
*   Refactor the configuration from traditional XML-based bean definitions to Annotation-based component scanning.

## Prerequisites
Before running this project, ensure your local development environment matches the lab's checklist:
*   Java Development Kit (JDK): JDK 17 or higher installed on your system.
*   Integrated Development Environment (IDE): IntelliJ IDEA.
*   Build Tool: Apache Maven configured within your project framework.
*   Libraries: Spring Context and Lombok (managed via pom.xml).

## Execution & Verification Output
When running the App.java class file through your IDE, Spring boots up the ApplicationContext, scans the com.craft package for @Component classes, builds the object graph (Injecting the Address into the Student, and the List<Student> into the School), and prints the console feedback:

`text
School Name: Spring Academy
--- Students List ---
ID: 101
Name: John Doe
City: Addis Ababa
Country: Ethiopia

Process finished with exit code 0
