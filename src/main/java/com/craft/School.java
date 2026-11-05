package com.craft;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@Component
public class School {
    @Value("Spring Academy")
    private String schoolName;

    // LIST OF BEANS INJECTION: Injects all Student beans into this list
    @Autowired
    private List<Student> students;
}