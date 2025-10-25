package com.femcoders.my_university.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.femcoders.my_university.service.StudentService;




@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //GET STUDENT SCHOOL ---------------------------------------------
    //sin DTO


    //con DTO Response sin mapper
    

    //con DTO Response con mapper manual


    //con DTO Response con mapper MapStruct


     //GET STUDENT COURSES ---------------------------------------------
    //sin DTO


    //con DTO Response sin mapper
    

    //con DTO Response con mapper manual


    //con DTO Response con mapper MapStruct



    
}
