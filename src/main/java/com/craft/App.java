package com.craft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring IoC container from beansConfig.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");

        // Retrieve the student bean managed by Spring
        Student student = context.getBean("student", Student.class);

        // Print the student details (populated via setter/property injection from XML)
        student.getDetails();
    }
}