package com.example.studentapi.controller;


import com.example.studentapi.model.student;
import com.example.studentapi.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class studentController {

    @Autowired
    private studentService studentService;

    @GetMapping
    public List<student> getAllStudents(){
        return studentService.getAllStudents();
    }


}
