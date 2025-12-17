package com.example.demo.controller;

import org.springframework.web.
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
Public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postda")
}