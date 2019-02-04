package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.CrdClientcode;

@Repository
public interface CrdClientCodeRepository extends JpaRepository<CrdClientcode , Integer> {

}
