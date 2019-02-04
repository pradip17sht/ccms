package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.CrdProduct;
import com.ccms.repository.CrdProductRepository;
import com.ccms.service.CrdProductService;

@Service
public class CrdProductServiceImpl extends GenericServiceImpl<CrdProduct, Integer> implements CrdProductService {

	private CrdProductRepository crdProductRepository;
	
	public CrdProductServiceImpl(CrdProductRepository crdProductRepository) {
		super(crdProductRepository);
		this.crdProductRepository = crdProductRepository;
	}

}
