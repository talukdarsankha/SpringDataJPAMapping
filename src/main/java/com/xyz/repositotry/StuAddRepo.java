package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.entity.StuAddress;

public interface StuAddRepo  extends JpaRepository<StuAddress, Integer>{

}
