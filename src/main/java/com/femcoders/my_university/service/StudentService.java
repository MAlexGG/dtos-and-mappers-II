package com.femcoders.my_university.service;

import org.springframework.http.ResponseEntity;

import com.femcoders.my_university.dto.response.StudentDetailsDto;
import com.femcoders.my_university.entity.Student;

public interface StudentService {
    
    //GET STUDENT SCHOOL
    public ResponseEntity<Student> getStudentProfileById(Integer id);
    public ResponseEntity<StudentDetailsDto> getStudentProfileByIdWithDtoAndMapStruct(Integer id);
    
}
