package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.CrdMember;
import com.ccms.repository.CrdMemberRepository;
import com.ccms.service.CrdMemberService;

@Service
public class CrdMemberServiceImpl extends GenericServiceImpl<CrdMember, Integer> implements CrdMemberService {

	private CrdMemberRepository crdMemberRepository;
	
	public CrdMemberServiceImpl(CrdMemberRepository crdMemberRepository) {
		super(crdMemberRepository);
		this.crdMemberRepository = crdMemberRepository;
	}

}
