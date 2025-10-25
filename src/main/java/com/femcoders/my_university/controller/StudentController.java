package com.femcoders.my_university.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.femcoders.my_university.entity.Student;
import com.femcoders.my_university.service.StudentService;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //GET STUDENT PROFILE ---------------------------------------------
    //sin DTO
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentProfileById(@PathVariable int id){
        return studentService.getStudentProfileById(id);
    }

    //con DTO Response sin mapper
    

    //con DTO Response con mapper manual


    //con DTO Response con mapper MapStruct

    
}
