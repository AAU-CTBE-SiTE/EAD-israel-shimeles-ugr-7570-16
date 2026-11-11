Lab 5: Spring Boot CRUD Application using Arrays
SPRING BOOT CUT USING ARRAYS
Student Name: Israel Shimeles  
Student ID: UGR/7570/16  

---

This repository contains the implementation of Lab 5. The objective of this lab is to develop a Spring Boot REST API utilizing Apache Maven and Spring Web to perform basic CRUD operations backed by an in-memory ArrayList data structure.

Task Requirements Map
According to the lab manual, the program satisfies the following criteria:
* Initialize a Spring Boot project configuration with web support.
* Implement an Actor model class containing data fields (such as id and name).
* Create an ActorController class annotated with @RestController and @RequestMapping("/actors").
* Maintain a local ArrayList dataset of actors to handle request endpoints efficiently.

Prerequisites
Before running this project, ensure your local development environment meets the required checklist:
* Java Development Kit (JDK): JDK 17 or higher installed on your system.
* Integrated Development Environment (IDE): IntelliJ IDEA.
* Build Tool: Apache Maven configured within your project framework.
* API Testing Tool: Web browser, Postman, or terminal curl commands to test endpoints.

Local Environment Verification Steps
To ensure your environment is configured correctly, verify your local setup using these steps:

Verify Maven Project Dependencies (pom.xml)
The project utilizes Spring Web starters to handle HTTP requests and JSON serialization automatically via Maven:
`xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
