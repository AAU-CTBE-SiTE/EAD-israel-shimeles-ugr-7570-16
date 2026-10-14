Lab1: Java Maven Starter Project

---

This repository contains the implementation of **Task 1** JDBC Lab Manual. The objective of this task is to configure a Java application using Maven, register the MySQL JDBC driver, and successfully establish a connection to a local MySQL database server.

---

Task Requirements Map
According to Task 1 (Page 23) of the lab manual, the program satisfies the following criteria:
*  Connect to a MySQL server with appropriate credentials.
* Initialize a database driver implementation class (`com.mysql.cj.jdbc.Driver`).
* Open a connection gateway to the local database server instance.

---

Prerequisites
Before running this project, ensure your local development environment matches the manual's checklist:

1. Java Development Kit (JDK): JDK 8 or higher installed on your system.
2. Integrated Development Environment (IDE): IntelliJ IDEA or Eclipse.
3. Database Server: MySQL Community Server installed and actively running.
4. Database Tools: MySQL Workbench or MySQL CLI access.
5. Build Tool:Apache Maven configured within your project framework.

---

 Local Environment Verification Steps
To ensure your environment is configured exactly like the lab manual requirements, verify your local setup using these steps:

 1. Verify Database Setup
Your local MySQL server must be active and host the target schema name. Run this command in your command line to create the database if you haven't already:
```sql
CREATE DATABASE StudentsDB;
```

 2. Verify Maven Project Dependencies (`pom.xml`)
The project utilizes the **Connector/J** driver jar to bridge the gap between Java and MySQL. Maven downloads this automatically using your dependency block:
```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.1.0</version>
</dependency>
```

3. Verify Project Directory Structure
Your project files are organized inside a clean Maven structure, focusing purely on source execution fields:
```text
JDBCLAB1/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── JDBCLAB1.java
```

---

Execution & Verification Output
When running the class file through your terminal or IDE execution framework, a successful compilation produces the following console feedback confirming a live local socket loop:

```bash
Established Connection
Process finished with exit code 0
```
