package com.femcoders.my_university.mapper;

import org.mapstruct.Mapper;

import com.femcoders.my_university.dto.response.SchoolWithStudentsDto;
import com.femcoders.my_university.entity.School;

@Mapper(componentModel = "spring", uses = StudentMapperMapStruct.class)
public interface SchoolMapperMapStruct {

    SchoolWithStudentsDto toDto(School school);

}
