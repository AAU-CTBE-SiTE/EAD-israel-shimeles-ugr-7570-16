# EAD-israel-shimeles-ugr-7570-16

Student Name: Israel Shimeles  
Student ID: ugr/7570/16  
Course: Enterprise Application Development (EAD)  
Branch: lab7  

---

## Lab Objective
Build and verify a full-stack Spring Boot RESTful CRUD application from scratch using Maven, Spring Web, Spring Data JPA, and MySQL to manage an Actor domain entity (id, name, bio) with automated schema generation.

---

## Prerequisites
* JDK: Java 17 or higher
* IDE: IntelliJ IDEA
* Build Tool: Apache Maven (Maven Wrapper included)
* Database: MySQL Server 8.0+ (with actor_db schema created)

---

## Task Requirement Map

| Layer / Component | Class / File | Implementation Details |
| :--- | :--- | :--- |
| Domain Entity | model/Actor.java | @Entity mapped to table actors with @Id, @GeneratedValue(strategy = GenerationType.IDENTITY) on id, plus name and bio fields. |
| Data Access | repository/ActorRepository.java | @Repository interface extending JpaRepository<Actor, Long> for standard persistence operations. |
| Business Logic | service/ActorService.java | @Service class handling getAllActors(), getActorById(), saveActor(), and deleteActor(). |
| REST API | controller/ActorController.java | @RestController mapped to /actors exposing GET, POST, and DELETE endpoints. |
| Configuration | resources/application.properties | Configures MySQL datasource (jdbc:mysql://localhost:3306/actor_db), MySQLDialect, and spring.jpa.hibernate.ddl-auto=update. |

---

## Local Environment Verification Steps

1. **Verify Maven Dependencies (pom.xml):**
   Ensure the project resolves the following core starters without errors:
   * spring-boot-starter-web
   * spring-boot-starter-data-jpa
   * mysql-connector-j

2. Initialize MySQL Database:
   `sql
   CREATE DATABASE actor_db;
