package com.example.spring_boot_pdp.lesson1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentForm {
    private String name;
    private String phoneNumber;
    private String courseName;
}
