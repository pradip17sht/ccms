package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.UserDepartment;
import com.ccms.repository.UserDepartmentRepository;
import com.ccms.service.UserDepartmentService;

@Service
public class UserDepartmentServiceImpl extends GenericServiceImpl<UserDepartment, Integer> implements UserDepartmentService{

	private UserDepartmentRepository userDepartmentRepository;
	
	public UserDepartmentServiceImpl(UserDepartmentRepository userDepartmentRepository) {
		super(userDepartmentRepository);
		this.userDepartmentRepository = userDepartmentRepository;
	}

}
