package com.jpahibernate.example.School_Management_System_DB.controller;


import com.jpahibernate.example.School_Management_System_DB.model.Student;
import com.jpahibernate.example.School_Management_System_DB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    // controller->service->repository

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String addStudent(@RequestBody Student student){
        String response =studentService.saveStudent(student);
        return response;
    }


    @PostMapping("/saveAllStudent")
    public String addAllStudents(@RequestBody List<Student> studentList){
        String response =studentService.saveStudents(studentList);
        return response;
    }
}
