package com.femcoders.my_university.mapper;

import org.mapstruct.Mapper;

import com.femcoders.my_university.dto.response.StudentDto;
import com.femcoders.my_university.entity.Student;

@Mapper(componentModel = "spring")
public interface StudentMapperMapStruct {

    StudentDto toDto(Student student);

}
