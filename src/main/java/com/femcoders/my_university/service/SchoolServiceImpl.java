package com.femcoders.my_university.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.femcoders.my_university.entity.School;
import com.femcoders.my_university.entity.Student;
import com.femcoders.my_university.repository.SchoolRepository;
import com.femcoders.my_university.repository.StudentRepository;

@Service
public class SchoolServiceImpl implements SchoolService {

    SchoolRepository schoolRepository;
    StudentRepository studentRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository,StudentRepository studentRepository){
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity<School> getSchoolById(int id) {
        School school = schoolRepository.findById(id).get();
        return new ResponseEntity<>(school, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Student>> getStudentsBySchool(int id) {
        School school = schoolRepository.findById(id).get();
        return new ResponseEntity<>(studentRepository.findBySchool(school), HttpStatus.OK);
    }

}
