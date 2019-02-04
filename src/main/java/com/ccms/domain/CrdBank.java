package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


/**
 * The persistent class for the crd_bank database table.
 * 
 */
@Entity
@Table(name="crd_bank")
@NamedQuery(name="CrdBank.findAll", query="SELECT c FROM CrdBank c")
public class CrdBank implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bank_id")
	private int bankId;

	@Column(name="bank_code", length = 6)
	@NotBlank
	private String bankCode;

	@Column(name="bank_name")
	@NotBlank
	private String bankName;

	public CrdBank() {
	}

	public int getBankId() {
		return this.bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}