package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.AccountLengthSetup;

@Repository
public interface AccountLengthSetupRepository extends JpaRepository<AccountLengthSetup, Integer> {

}
