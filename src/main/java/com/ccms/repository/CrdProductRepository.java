package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.CrdProduct;

@Repository
public interface CrdProductRepository extends JpaRepository<CrdProduct, Integer> {

}
