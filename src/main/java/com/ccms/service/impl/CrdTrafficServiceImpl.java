package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.CrdTraffic;
import com.ccms.repository.CrdTrafficRepository;
import com.ccms.service.CrdTrafficService;

@Service
public class CrdTrafficServiceImpl extends GenericServiceImpl<CrdTraffic, Integer> implements CrdTrafficService {

	private CrdTrafficRepository crdTrafficRepository;
	
	public CrdTrafficServiceImpl(CrdTrafficRepository crdTrafficRepository) {
		super(crdTrafficRepository);
		this.crdTrafficRepository = crdTrafficRepository;
	}

}
