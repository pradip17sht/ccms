package com.ccms.service.impl;


import org.springframework.stereotype.Service;

import com.ccms.domain.CrdBank;
import com.ccms.repository.CrdBankRepository;
import com.ccms.service.CrdBankService;

@Service
public class CrdBankServiceImpl extends GenericServiceImpl<CrdBank, Integer> implements CrdBankService{
	
	private CrdBankRepository crdBankRepository;
	
	public CrdBankServiceImpl(CrdBankRepository crdBankRepository) {
		super(crdBankRepository);
		this.crdBankRepository = crdBankRepository;
	}
}
