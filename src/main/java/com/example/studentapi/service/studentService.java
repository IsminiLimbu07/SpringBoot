package com.example.studentapi.service;


import com.example.studentapi.model.student;
import com.example.studentapi.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    @Autowired
    private studentRepository studentRepo;

    //Get all students
    public List<student> getAllStudents() {
        return studentRepo.findAll();
    }

    //Get Students by ID
    public Optional<student> getStudentById(Long id){
        return studentRepo.findById(id);
    }

    //Create/Save Student
    public student save(student student) {
        return studentRepo.save(student);
    }

    //Update Student
    public student update(Long id, student studentDetails){
        student student = studentRepo.findById(id).orElse(null);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            return studentRepo.save(student);
        }
        return null;
    }

    //Delete
    public student delete(Long id){
        studentRepo.deleteById(id);
        return null;
    }

}
