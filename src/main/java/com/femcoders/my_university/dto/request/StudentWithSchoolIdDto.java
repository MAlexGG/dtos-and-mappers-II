package com.femcoders.my_university.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentWithSchoolIdDto {

    private String name;
    private String lastname;
    private String dni_nie;
    private Integer phone;
    private String email;
    private Integer schoolId;
    
}
