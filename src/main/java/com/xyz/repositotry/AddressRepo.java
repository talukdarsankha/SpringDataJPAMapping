package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
