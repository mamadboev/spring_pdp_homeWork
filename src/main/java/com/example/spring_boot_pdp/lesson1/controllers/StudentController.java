package com.example.spring_boot_pdp.lesson1.controllers;

import com.example.spring_boot_pdp.lesson1.dto.Student;
import com.example.spring_boot_pdp.lesson1.dto.StudentForm;
import com.example.spring_boot_pdp.lesson1.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping(value = "/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(studentService.list());
    }

    @GetMapping(value = "/view/{id}")
    public ResponseEntity view(@PathVariable("id") int id) {
        return ResponseEntity.ok(studentService.view(id));
    }

    @PostMapping(value = "/add")
    public ResponseEntity add(@RequestBody Student student){
        return ResponseEntity.ok(studentService.add(student));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity update(@PathVariable("id") int id, @RequestBody StudentForm student){
        return ResponseEntity.ok(studentService.update(id, student));
    }
}
