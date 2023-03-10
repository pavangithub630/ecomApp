package com.pav.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pav.application.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
