package com.femcoders.my_university.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.femcoders.my_university.dto.request.StudentWithSchoolIdDto;
import com.femcoders.my_university.dto.response.StudentDetailsDto;
import com.femcoders.my_university.entity.Student;
import com.femcoders.my_university.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
    public ResponseEntity<Student> getStudentProfileById(@PathVariable Integer id){
        return studentService.getStudentProfileById(id);
    }

    //con DTO Response con mapper MapStruct
    @GetMapping("/student/mapstruct/{id}")
    public ResponseEntity<StudentDetailsDto> getStudentProfileByIdWithDtoAndMapStruct(@PathVariable Integer id){
        return studentService.getStudentProfileByIdWithDtoAndMapStruct(id);
    }

    //CREATE STUDENT WITH SCHOOL
    //sin Dto
    @PostMapping("/student/school/{id}")
    public ResponseEntity<Student> createStudentWithSchool(@Valid @RequestBody Student student, @PathVariable Integer id) {
        return studentService.createStudentWithSchool(student, id);
    }

    //con Dto con mapper MapStruct
    @PostMapping("/student/school/mapstruct")
    public ResponseEntity<Student> createStudentWithSchoolWithDtoAndMapStruct(@Valid @RequestBody StudentWithSchoolIdDto student) {
        return studentService.createStudentWithSchoolWithDtoAndMapStruct(student);
    }

    
    
    
}
