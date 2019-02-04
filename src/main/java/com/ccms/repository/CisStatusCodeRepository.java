package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.CisStatusCode;

@Repository
public interface CisStatusCodeRepository extends JpaRepository<CisStatusCode, Integer> {

}
