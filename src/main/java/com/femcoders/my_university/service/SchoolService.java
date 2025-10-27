package com.femcoders.my_university.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.femcoders.my_university.dto.response.SchoolWithStudentsDto;
import com.femcoders.my_university.entity.School;
import com.femcoders.my_university.entity.Student;

public interface SchoolService {
    
    public ResponseEntity<School> getSchoolById(int id);

    //GET STUDENTS BY SCHOOL
    public ResponseEntity<List<Student>> getStudentsBySchool(int id);
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDto(int id);
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapper(int id);
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapStruct(int id);



}
