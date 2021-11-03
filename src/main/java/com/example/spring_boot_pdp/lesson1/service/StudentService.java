package com.example.spring_boot_pdp.lesson1.service;

import com.example.spring_boot_pdp.lesson1.dto.Student;
import com.example.spring_boot_pdp.lesson1.dto.StudentForm;

import java.util.List;

public interface StudentService {
    List<Student> list();

    Student view(int id);

    String add(Student student);

    String update(int id, StudentForm student);
}
