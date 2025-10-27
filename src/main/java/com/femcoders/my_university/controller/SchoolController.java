package com.femcoders.my_university.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.femcoders.my_university.dto.response.SchoolWithStudentsDto;
import com.femcoders.my_university.entity.School;
import com.femcoders.my_university.entity.Student;
import com.femcoders.my_university.service.SchoolService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @GetMapping("/school/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable int id) {
        return schoolService.getSchoolById(id);
    }
    
    //GET STUDENTS BY SCHOOL
    //Sin Dto
    @GetMapping("/{id}")
    public ResponseEntity<List<Student>> getStudentsBySchool(@PathVariable int id){
        return schoolService.getStudentsBySchool(id);
    }

    //con Dto sin mapper
    @GetMapping("/dto/{id}")
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDto(@PathVariable int id){
        return schoolService.getStudentsBySchoolWithDto(id);
    }

    //con Dto con mapper manual
    @GetMapping("/mapper/{id}")
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapper(@PathVariable int id) {
        return schoolService.getStudentsBySchoolWithDtoAndMapper(id);
    }
    
}
