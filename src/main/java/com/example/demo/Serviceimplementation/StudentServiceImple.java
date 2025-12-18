package com.example.demo.Serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {
    //  private final StudentRepository studentRepository;
    // public StudentServiceImplementation(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }
    @Autowired
    StudentRepository studentRepository;
   
     public Student saveStudent(Student student){
     return studentRepository.save(student);
    }
}