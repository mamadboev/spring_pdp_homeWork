package com.example.spring_boot_pdp.lesson1.service.impl;

import com.example.spring_boot_pdp.lesson1.dto.Student;
import com.example.spring_boot_pdp.lesson1.dto.StudentForm;
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

    @Override
    public String add(Student student) {
        for (Student student1 : list) {
            if (student.getId() == student1.getId()) {
                return "Bunday ID mavjud!";
            }

            if (student.getPhoneNumber().equals(student1.getPhoneNumber())) {
                return student1.getPhoneNumber() + " telefon raqami mavjud!";
            }
        }

        list.add(student);
        return "Yangi Student qo'shildi!";
    }

    @Override
    public String update(int id, StudentForm student) {
        for (Student student1 : list) {
            if (id == student1.getId()) {
                student1.setCourseName(student.getCourseName());
                student1.setName(student.getName());
                student1.setPhoneNumber(student.getPhoneNumber());

                return "Student yangilandi!";
            }
        }
        return "Student topilmadi!";
    }

    @Override
    public String delete(int id) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return "Student o'chirildi!";
            }
        }
        return "Student topilmadi!";
    }
}
