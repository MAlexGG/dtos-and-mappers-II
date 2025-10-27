package com.femcoders.my_university.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.femcoders.my_university.dto.request.StudentWithSchoolIdDto;
import com.femcoders.my_university.dto.response.StudentDetailsDto;
import com.femcoders.my_university.entity.Student;
import com.femcoders.my_university.mapper.StudentMapperMapStruct;
import com.femcoders.my_university.repository.SchoolRepository;
import com.femcoders.my_university.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private StudentMapperMapStruct studentMapperMapStruct;
    private SchoolRepository schoolRepository;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapperMapStruct studentMapperMapStruct, SchoolRepository schoolRepository){
        this.studentRepository = studentRepository;
        this.studentMapperMapStruct = studentMapperMapStruct;
        this.schoolRepository = schoolRepository;
    }

    //GET STUDENT SCHOOL ---------------------------------------------
    //sin DTO
    @Override
    public ResponseEntity<Student> getStudentProfileById(Integer id) {
        Student student = studentRepository.findById(id).get();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    //con DTO Response con mapper MapStruct
    @Override
    public ResponseEntity<StudentDetailsDto> getStudentProfileByIdWithDtoAndMapStruct(Integer id) {
        Student studentFounded = studentRepository.findById(id).get();
        StudentDetailsDto dto = studentMapperMapStruct.toDetailsDto(studentFounded);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //CREATE STUDENT WITH SCHOOL ----------------------------------------
    //sin DTO
    @Override
    public ResponseEntity<Student> createStudentWithSchool(Student student, Integer schoolId) {
        student.setSchool(schoolRepository.findById(schoolId).get());
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    //con Dto con mapper MapStruct
    @Override
    public ResponseEntity<Student> createStudentWithSchoolWithDtoAndMapStruct(StudentWithSchoolIdDto dto) {
        Student student = studentMapperMapStruct.toEntity(dto);
        student.setSchool(schoolRepository.findById(dto.getSchoolId()).get());
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }
    
}