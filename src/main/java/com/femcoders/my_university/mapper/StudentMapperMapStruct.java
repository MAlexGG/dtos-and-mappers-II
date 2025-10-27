package com.femcoders.my_university.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.femcoders.my_university.dto.response.StudentDetailsDto;
import com.femcoders.my_university.dto.response.StudentDto;
import com.femcoders.my_university.entity.Student;

@Mapper(componentModel = "spring")
public interface StudentMapperMapStruct {

    StudentDto toDto(Student student);

    @Mapping(source = "school.id", target = "schoolId")
    @Mapping(source = "school.name", target = "schoolName")
    StudentDetailsDto toDetailsDto(Student student);

}
