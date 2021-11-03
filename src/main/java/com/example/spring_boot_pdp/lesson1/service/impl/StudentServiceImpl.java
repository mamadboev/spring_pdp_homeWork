package com.example.spring_boot_pdp.lesson1.service.impl;

import com.example.spring_boot_pdp.lesson1.dto.Student;
import com.example.spring_boot_pdp.lesson1.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private static final List<Student> list = new ArrayList<>(
            Arrays.asList(
                    new Student(100, "Karim", "+9989555555", "Java"),
                    new Student(101, "Akbarali", "+9989555555", "C++"),
                    new Student(102, "Yasmin", "+9989555555", "Php"),
                    new Student(103, "Mirzo", "+9989555555", "JS")
            )
    );

    @Override
    public List<Student> list() {
        return list;
    }

    @Override
    public Student view(int id) {
        for (Student listOne : list) {
            if (listOne.getId() == id) {
                return listOne;
            }
        }
        return null;
    }
}
