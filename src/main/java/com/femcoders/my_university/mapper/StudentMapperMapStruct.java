package com.femcoders.my_university.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.femcoders.my_university.dto.request.StudentWithSchoolIdDto;
import com.femcoders.my_university.dto.response.StudentDetailsDto;
import com.femcoders.my_university.dto.response.StudentDto;
import com.femcoders.my_university.entity.Student;

@Mapper(componentModel = "spring")
public interface StudentMapperMapStruct {

    StudentDto toDto(Student student);

    //Para usar un nombre en el dto y otro en la entidad
    @Mapping(source = "dni_nie", target = "dniNie")
    //Para aplanar relaciones anidadas
    @Mapping(source = "school.id", target = "schoolId")
    @Mapping(source = "school.name", target = "schoolName")
    StudentDetailsDto toDetailsDto(Student student);

    @Mapping(source = "schoolId", target = "school.id")
    Student toEntity(StudentWithSchoolIdDto dto);

}
