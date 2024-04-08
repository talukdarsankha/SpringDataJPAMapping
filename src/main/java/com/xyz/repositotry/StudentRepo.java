package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
