package com.example.demo.controller;

importorg.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
Public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}