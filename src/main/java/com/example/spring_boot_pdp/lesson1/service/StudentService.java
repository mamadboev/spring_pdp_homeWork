package com.example.spring_boot_pdp.lesson1.service;

import com.example.spring_boot_pdp.lesson1.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> list();

    Student view(int id);
}
