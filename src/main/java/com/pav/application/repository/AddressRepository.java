package com.pav.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pav.application.entity.Address;

public interface AddressRepository  extends JpaRepository<Address, Long>{

}
