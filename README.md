 Lab 2: JPA and Hibernate ORM Implementation
This repository contains the implementation of Lab 2 (JPA Lab Manual). The objective of this task is to integrate the Java Persistence API (JPA) with Hibernate to map Java objects to a MySQL relational database, automate schema generation, and perform CRUD and JPQL operations without writing raw SQL.

 Task Requirements Map
According to the JPA Lab Manual, the program satisfies the following criteria:
- Configure Jakarta Persistence using a persistence.xml file.
- Map a Java class (Student) to a database table using JPA annotations (@Entity, @Id, @GeneratedValue).
- Utilize the EntityManagerFactory and EntityManager to manage the persistence context.
- Perform standard CRUD operations (persist, find, remove).
- Execute complex JPQL (Java Persistence Query Language) queries for filtering, aggregation, and bulk updates.

 Prerequisites
Before running this project, ensure your local development environment matches the manual's checklist:
- Java Development Kit (JDK): JDK 17 or higher installed on your system.
- Integrated Development Environment (IDE): IntelliJ IDEA.
- Database Server: MySQL Community Server installed and actively running.
- Database Tools: MySQL Workbench or IntelliJ Database Tool window.
- Build Tool: Apache Maven configured within your project framework.

 Local Environment Verification Steps
To ensure your environment is configured exactly like the lab manual requirements, verify your local setup using these steps:

 Verify Database Setup
Your local MySQL server must be active and host the target schema name. Run this command in your command line to create the database if you haven't already:
`sql
CREATE DATABASE jpadb1;
