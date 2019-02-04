package com.ccms.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import com.ccms.domain.AccountLengthSetup;
import com.ccms.domain.AtmDetail;
import com.ccms.domain.CisStatusCode;
import com.ccms.domain.CrdBank;
import com.ccms.domain.CrdBranch;
import com.ccms.domain.CrdProduct;
import com.ccms.domain.CrdTraffic;
import com.ccms.domain.UserDepartment;

@Component
public class Validation {

	// AccountLengthSetup Domain Validation
	public BindingResult validateAccountLengthSetup(AccountLengthSetup accountLengthSetup, BindingResult bindingResult,
			ValidationCase validationCase) {
		return bindingResult;
	}

	// CrdBranch Domain Validation
	public BindingResult validateCrdBranch(CrdBranch crdBranch, BindingResult bindingResult,
			ValidationCase validationCase) {
		return bindingResult;
	}

	// CrdTraffic Domain Validation
	public BindingResult validateCrdTraffic(CrdTraffic crdTraffic, BindingResult bindingResult,
			ValidationCase validationCase) {
		return bindingResult;
	}

	// CrdProduct Domain Validation
	public BindingResult validateCrdProduct(CrdProduct crdProduct, BindingResult bindingResult,
			ValidationCase validationCase) {
		return bindingResult;
	}

	// CrdBank Domain Validation
	public BindingResult validateCrdBank(CrdBank crdBank, BindingResult bindingResult, ValidationCase validationCase) {
		return bindingResult;
	}

	// UserDepartment Domain Validation
	public BindingResult validateUserDepartment(UserDepartment userDepartment, BindingResult bindingResult,
			ValidationCase validationCase) {
		return bindingResult;
	}

	// CisStatusCode Domain Validation
	public BindingResult validateCisStatusCode(CisStatusCode cisStatusCode, BindingResult bindingResult, ValidationCase validationCase) {
		return bindingResult;
	}

	// AtmDetail Domain Validation
	public BindingResult validateAtmDetail(AtmDetail atmDetail, BindingResult bindingResult, ValidationCase validationCase) {
		return bindingResult;
	}
}
