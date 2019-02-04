package com.ccms.service.impl;

import org.springframework.stereotype.Service;

import com.ccms.domain.AccountLengthSetup;
import com.ccms.repository.AccountLengthSetupRepository;
import com.ccms.service.AccountLengthSetupService;

@Service
public class AccountLengthSetupServiceImpl extends GenericServiceImpl<AccountLengthSetup, Integer> implements AccountLengthSetupService {

	private AccountLengthSetupRepository accountLengthSetupRepository;
	
	public AccountLengthSetupServiceImpl(AccountLengthSetupRepository accountLengthSetupRepository) {
		super(accountLengthSetupRepository);
		this.accountLengthSetupRepository = accountLengthSetupRepository;
	}

}
