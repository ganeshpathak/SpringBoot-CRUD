package com.example.RestAPI.service;

import java.util.ArrayList;
import java.util.List;
import com.example.RestAPI.dao.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1,"Ganesh","Pune"));
        students.add(new Student(2,"Amay","Mumbai"));
    };

    public List<Student> getStudents(){
        return StudentService.students;
    }

    public Student getStudentById(int studentId){
        return StudentService.students.stream().
                filter( stud -> studentId == stud.getId())
                .findFirst()
                .get();
    }
}
