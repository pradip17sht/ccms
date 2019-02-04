package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccms.domain.UserDepartment;

@Repository
public interface UserDepartmentRepository extends JpaRepository<UserDepartment, Integer> {
	
}
