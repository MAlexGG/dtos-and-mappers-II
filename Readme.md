# :scissors: DTOs & MAPPERS, part II

## Context
This is the continuation of an API that manages students and the school they are enrolled in at the university.The relationship between students and schools will be one-to-many (a student can only enroll in one school, but a school allows multiple students to enroll). 

The student will be able to see the school they are enrolled in on their profile (the relationship will be flattened in the response). The university will be able to see the list of students enrolled in a school (the structure of the response will be modified).

### Objective
- Learn the differences between creating a method using only entities, using DTOs, using DTOs and manual mappers and using DTOs and MapStruct when having relations between entities.
- Learn how to use MapStruct and @Mapping annotation.

### Technologies
- Java 21
- Spring Boot 
- h2 console

### Resources
[Part I](https://github.com/MAlexGG/dtos-and-mappers-I.git)
