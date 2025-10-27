package com.femcoders.my_university.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.femcoders.my_university.dto.response.SchoolWithStudentsDto;
import com.femcoders.my_university.dto.response.StudentDto;
import com.femcoders.my_university.entity.School;
import com.femcoders.my_university.entity.Student;

@Component
public class SchoolMapper {

    private StudentDto toStudentDto(Student student){
        if(student == null) return null;
        return new StudentDto(
            student.getId(),
            student.getName(),
            student.getLastname(),
            student.getDni_nie(),
            student.getPhone(),
            student.getEmail()
        );
    }

    public SchoolWithStudentsDto toDto(School school){
        if(school == null) return null;

        List<StudentDto> students = null;

        if(school.getStudents() != null){
            students = school.getStudents().stream()
            .map(this::toStudentDto)
            .collect(Collectors.toList());
        }

        return new SchoolWithStudentsDto(
            school.getId(),
            school.getName(),
            students
        );
    }

}
