package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.AtmDetail;

@Repository
public interface AtmDetailRepository extends JpaRepository<AtmDetail, Integer> {

}
