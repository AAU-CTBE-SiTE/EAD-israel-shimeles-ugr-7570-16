# Lab 3: Spring Core IoC & Dependency Injection

This repository contains the implementation for Lab 3 of the Enterprise Application Development (EAD) course. The objective of this assignment is to configure a Spring Framework application using Maven, define a student model using Lombok, and implement Inversion of Control (IoC) and Dependency Injection (DI) using an XML configuration file (`beansConfig.xml`).


- **Branch:** `lab3`
- **Student Name:** Israel Shimeles
- **Student ID:** ugr/7570/16

---

## Lab Requirements Map
According to the lab manual specifications, this program satisfies the following core criteria:
- **IoC Container Initialization:** Load the Spring container via `ClassPathXmlApplicationContext` using `beansConfig.xml`.
- **Bean Configuration:** Define and configure Spring beans with property values using XML setter-based injection.
- **Boilerplate Reduction:** Utilize Lombok annotations (`@Data`, `@ToString`) to streamline the model class (`Student.java`).
- **Application Execution:** Retrieve the managed bean from the container context and invoke business methods to display property values.

---

## Prerequisites
Before running this project, ensure your local development environment meets the following checklist:
1. **Java Development Kit (JDK):** JDK 19 or higher installed on your system.
2. **Build Tool:** Apache Maven configured within your project framework.
3. **IDE:** IntelliJ IDEA (or any compatible Java IDE).
4. **Version Control:** Git configured for branch-based submission.

---

Execution & Verification Output
When running the App.java main launcher class through your terminal or IDE execution framework, successful compilation and container loading produce the following console feedback:

Plaintext
Student Details Student(id=101, name=John Doe, age=20)

Process finished with exit code 0
