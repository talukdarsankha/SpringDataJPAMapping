package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.entity.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {

}
