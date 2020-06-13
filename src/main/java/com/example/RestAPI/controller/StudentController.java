package com.example.RestAPI.controller;

import com.example.RestAPI.dao.Student;
import com.example.RestAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public Collection<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping("/students")
    private String addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    @PutMapping("/students")
    private String updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{studentId}")
    public Student removeStudent(@PathVariable("studentId") int studentId){
        return studentService.removeStudentById(studentId);
    }
}
