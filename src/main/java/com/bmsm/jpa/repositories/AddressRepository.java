package com.bmsm.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmsm.common.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
