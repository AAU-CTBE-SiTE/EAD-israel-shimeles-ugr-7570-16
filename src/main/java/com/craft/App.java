package com.craft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");

        // Get the School bean
        School school = context.getBean(School.class);

        System.out.println("School Name: " + school.getSchoolName());
        System.out.println("--- Students List ---");

        // Loop through the List of injected Student beans
        for (Student s : school.getStudents()) {
            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("City: " + s.getAddress().getCity());
            System.out.println("Country: " + s.getAddress().getCountry());
        }
    }
}