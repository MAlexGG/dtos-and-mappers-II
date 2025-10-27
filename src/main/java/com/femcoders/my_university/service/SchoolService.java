package com.femcoders.my_university.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.femcoders.my_university.dto.response.SchoolWithStudentsDto;
import com.femcoders.my_university.entity.Student;

public interface SchoolService {

    //GET STUDENTS BY SCHOOL
    public ResponseEntity<List<Student>> getStudentsBySchool(Integer id);
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDto(Integer id);
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapper(Integer id);
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapStruct(Integer id);



}
