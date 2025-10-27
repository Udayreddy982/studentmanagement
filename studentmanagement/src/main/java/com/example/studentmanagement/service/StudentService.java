package com.example.studentmanagement.service;


import com.example.studentmanagement.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
                                  //Marks this class as a Service Component in your Spring Boot application.
                                 //Spring automatically detects it during startup and creates an object (bean) for it
public class StudentService {
    @Autowired                    //Automatically injects (wires) the StudentRepository into your StudentService.
                                  // You don’t need to write:StudentRepository studentRepository = new StudentRepository();
    private StudentRepository studentRepository;
   //Find all students
    public List<Student>getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }



}
