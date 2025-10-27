package com.femcoders.my_university.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailsDto {

    private Integer id;
    private String name;
    private String lastname;
    private String dni_nie;
    private Integer phone;
    private String email;

    //Estos nombres de campos no existen en la entidad
    private Integer schoolId; 
    private String schoolName;

}
