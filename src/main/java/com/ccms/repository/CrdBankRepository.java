package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.CrdBank;

@Repository
public interface CrdBankRepository extends JpaRepository<CrdBank, Integer> {

}
