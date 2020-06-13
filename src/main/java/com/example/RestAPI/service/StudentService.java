package com.example.RestAPI.service;

import java.util.*;

import com.example.RestAPI.dao.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private static Map<Integer, Student> students = new HashMap<>();

    static {
        students.put(1, new Student(1,"Ganesh","Pune"));
        students.put(2, new Student(2,"Amay","Mumbai"));
        students.put(3, new Student(3,"Dinesh","Nashik"));
        students.put(4, new Student(4,"Praveen","Thane"));
    };

    public Collection<Student> getStudents(){
        return StudentService.students.values();
    }

    public Student getStudentById(int studentId){
        return StudentService.students.get(studentId);
    }

    public String addStudent(Student student)
    {
        StudentService.students.put(student.getId(), student);
        return "Student added successfully";
    }

    public String updateStudent(Student student)
    {
        StudentService.students.put(student.getId(), student);
        return "Student updated successfully";
    }

    public Student removeStudentById(int studentId){
        return StudentService.students.remove(studentId);
    }
}
