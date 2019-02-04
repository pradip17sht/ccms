package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.CisStatusCode;
import com.ccms.repository.CisStatusCodeRepository;
import com.ccms.service.CisStatusCodeService;

@Service
public class CisStatusCodeServiceImpl extends GenericServiceImpl<CisStatusCode, Integer> implements CisStatusCodeService {

	private CisStatusCodeRepository cisStatusCodeRepository;

	public CisStatusCodeServiceImpl(CisStatusCodeRepository cisStatusCodeRepository) {
		super(cisStatusCodeRepository);
		this.cisStatusCodeRepository = cisStatusCodeRepository;
	}
}
