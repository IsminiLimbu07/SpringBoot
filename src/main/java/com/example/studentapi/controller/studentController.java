package com.example.studentapi.controller;


import com.example.studentapi.model.student;
import com.example.studentapi.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class studentController {

    @Autowired
    private studentService studentService;

    @GetMapping
    public List<student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<student> getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);
    }

    @PostMapping
    public student createStudent(@RequestBody student student){

        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public student updateStudent(@PathVariable Long id, @RequestBody student studentDetails){
        return studentService.update(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public student delete(@PathVariable Long id){
        return studentService.delete(id);
    }

}
