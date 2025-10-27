package com.femcoders.my_university.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.femcoders.my_university.dto.response.SchoolWithStudentsDto;
import com.femcoders.my_university.dto.response.StudentDto;
import com.femcoders.my_university.entity.School;
import com.femcoders.my_university.entity.Student;
import com.femcoders.my_university.mapper.SchoolMapper;
import com.femcoders.my_university.mapper.SchoolMapperMapStruct;
import com.femcoders.my_university.repository.SchoolRepository;
import com.femcoders.my_university.repository.StudentRepository;

@Service
public class SchoolServiceImpl implements SchoolService {

    SchoolRepository schoolRepository;
    StudentRepository studentRepository;
    SchoolMapper schoolMapper;
    SchoolMapperMapStruct schoolMapperMapStruct;

    public SchoolServiceImpl(SchoolRepository schoolRepository, StudentRepository studentRepository, SchoolMapper schoolMapper,SchoolMapperMapStruct schoolMapperMapStruct){
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
        this.schoolMapper = schoolMapper;
        this.schoolMapperMapStruct = schoolMapperMapStruct;
    }

    //GET STUDENTS BY SCHOOL
    //sin Dto
    @Override
    public ResponseEntity<List<Student>> getStudentsBySchool(Integer id) {
        School school = schoolRepository.findById(id).get();
        return new ResponseEntity<>(studentRepository.findBySchool(school), HttpStatus.OK);
    }

    //con Dto sin mapper
    @Override
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDto(Integer id) {
        School school = schoolRepository.findById(id).get();

        List<StudentDto> students = school.getStudents().stream()
        .map(student -> new StudentDto(student.getId(), student.getName(), student.getLastname(), student.getDni_nie(), student.getPhone(), student.getEmail())).toList();

        SchoolWithStudentsDto response = new SchoolWithStudentsDto(school.getId(), school.getName(), students);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    //con Dto y mapper manual
    @Override
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapper(Integer id) {
        School school = schoolRepository.findById(id).get();
        return new ResponseEntity<>(schoolMapper.toDto(school), HttpStatus.OK);
    }

    //con Dto y mapper MapStruct
    @Override
    public ResponseEntity<SchoolWithStudentsDto> getStudentsBySchoolWithDtoAndMapStruct(Integer id) {
        School school = schoolRepository.findById(id).get();
        return new ResponseEntity<>(schoolMapperMapStruct.toDto(school), HttpStatus.OK);
    }

    
    
    



}
