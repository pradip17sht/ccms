package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.AtmDetail;
import com.ccms.repository.AtmDetailRepository;
import com.ccms.service.AtmDetailService;

@Service
public class AtmDetailServiceImpl extends GenericServiceImpl<AtmDetail, Integer> implements AtmDetailService {
	
	private AtmDetailRepository atmDetailRepository;
	
	public AtmDetailServiceImpl (AtmDetailRepository atmDetailRepository) {
		super(atmDetailRepository);
		this.atmDetailRepository = atmDetailRepository;
	}
}
