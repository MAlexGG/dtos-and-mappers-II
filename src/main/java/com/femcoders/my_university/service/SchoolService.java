package com.femcoders.my_university.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.femcoders.my_university.entity.School;
import com.femcoders.my_university.entity.Student;

public interface SchoolService {
    
    public ResponseEntity<School> getSchoolById(int id);
    public ResponseEntity<List<Student>> getStudentsBySchool(int id);


}
