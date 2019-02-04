package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.CrdBranch;
import com.ccms.repository.CrdBranchRepository;
import com.ccms.service.CrdBranchService;

@Service
public class CrdBranchServiceImpl extends GenericServiceImpl<CrdBranch, Integer> implements CrdBranchService{

	private CrdBranchRepository crdBranchRepository;
	
	public CrdBranchServiceImpl(CrdBranchRepository crdBranchRepository) {
		super(crdBranchRepository);
		this.crdBranchRepository = crdBranchRepository;
	}
}
