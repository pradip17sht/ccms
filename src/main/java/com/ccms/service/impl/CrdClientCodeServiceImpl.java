package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.CrdClientcode;
import com.ccms.repository.CrdClientCodeRepository;
import com.ccms.service.CrdClientCodeService;

@Service
public class CrdClientCodeServiceImpl extends GenericServiceImpl<CrdClientcode, Integer> implements CrdClientCodeService {

	private CrdClientCodeRepository crdClientCodeRepository;
	
	public CrdClientCodeServiceImpl( CrdClientCodeRepository crdClientCodeRepository) {
		super(crdClientCodeRepository);
		this.crdClientCodeRepository = crdClientCodeRepository;
	}

}
