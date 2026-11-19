
NAME - ISRAEL SHIMELES
ID - UGR/7570/16
# Student Management REST API

Spring Boot RESTful CRUD application built with Java, Maven, Spring Web, Spring Data JPA, Lombok, and MySQL for Enterprise Application Development (Lab 8).

## Tech Stack
* Java & Apache Maven
* Spring Boot (Spring Web, Spring Data JPA)
* MySQL (student_management database)
* Lombok

## Database Configuration
Configure src/main/resources/application.properties with your MySQL credentials:

spring.application.name=student-management
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
## API Endpoints
Base URL: http://localhost:8080/api/students

* POST /api/students — Create a new student
* GET /api/students — Get all students
* GET /api/students/{id} — Get a student by ID (returns null if not found)
* PUT /api/students/{id} — Update an existing student by ID (returns null if not found)
* DELETE /api/students/{id} — Delete a student by ID

## AI Chat History
* https://chatgpt.com/share/6afea260-88ac-83e9-af23-85280ae6eabd
* https://chatgpt.com/share/6afea278-4da4-83e9-b43a-7f85e90082b9