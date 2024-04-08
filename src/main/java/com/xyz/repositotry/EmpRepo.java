package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.entity.Employee;

@Repository 
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
