# DTOs & MAPPERS, part I

## Context
This is the continuation of an API that manages students and the courses they are enrolled in at one of the university's schools.The relationship between students and schools will be one-to-many (a student can only enroll in one school, but a school allows multiple students to enroll). The relationship between students and courses will be many-to-many (a student can enroll in multiple courses, and a course can have multiple students).

The student will be able to see the school they are enrolled in along with the courses on their profile. The university will be able to see the list of students enrolled in a school. The school will be able to see the list of students enrolled in each course.

### Objective
- Learn the differences between creating a method using only entities, using DTOs, using DTOs and manual mappers and using DTOs and MapStruct when having relations between entities.

### Technologies
- Java 21
- Spring Boot 
- h2 console

### Resources
[Part I](https://github.com/MAlexGG/dtos-and-mappers-I.git)
