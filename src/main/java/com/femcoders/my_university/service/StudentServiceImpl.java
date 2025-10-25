package com.femcoders.my_university.service;

import org.springframework.stereotype.Service;

import com.femcoders.my_university.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    //GET STUDENT SCHOOL ---------------------------------------------
    //sin DTO
    

    //con DTO Response sin mapper
    

    //con DTO Response con mapper manual
    

    //con DTO Response con mapper MapStruct
    


    //GET STUDENT COURSES ----------------------------------------------
    //sin DTO
    

    //con DTO Response sin mapper
    

    //con DTO Response con mapper manual
    

    //con DTO Response con mapper MapStruct
    
}