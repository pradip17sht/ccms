package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.CrdProduct;
import com.ccms.domain.CrdTraffic;

@Repository
public interface CrdTrafficRepository extends JpaRepository<CrdTraffic, Integer> {

}
