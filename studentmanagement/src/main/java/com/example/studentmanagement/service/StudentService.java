package com.example.studentmanagement.service;


import com.example.studentmanagement.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    //Find student their id
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }
    //adding new student
    public Student addStudent(Student student){
      return studentRepository.save(student);
    }
    //updating student information
    public Student updateStudent(Student student) {
        if (!studentRepository.existsById(student.getId())) {
            throw new RuntimeException("Cannot update: Student not found with id:" + student.getId());
        }
        return studentRepository.save(student);
    }
    //deleting the student data
    public void deleteStudent(long id){
        if(!studentRepository.existsById(id)){
            throw new RuntimeException("Cannot delete:student not found with id:" + id);
        }
        studentRepository.deleteById(id);
    }
    //adding bulk data
    public List<Student> addMultipleStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }



}
