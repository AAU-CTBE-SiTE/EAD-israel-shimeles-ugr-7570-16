package com.craft;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    @Value("101")
    private int id;

    @Value("John Doe")
    private String name;

    // OBJECT INJECTION: Injects the single Address bean
    @Autowired
    private Address address;
}