package com.femcoders.my_university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.femcoders.my_university.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
