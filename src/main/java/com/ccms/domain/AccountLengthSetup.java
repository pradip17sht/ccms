package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * The persistent class for the accountlength_setup database table.
 * 
 */
@Entity
@Table(name="accountlength_setup")
@NamedQuery(name="AccountLengthSetup.findAll", query="SELECT a FROM AccountLengthSetup a")
public class AccountLengthSetup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="accountno_id")
	private int accountnoId;

	@Column(name="account_length")
	private int accountLength;

	public AccountLengthSetup() {
	}

	public int getAccountnoId() {
		return this.accountnoId;
	}

	public void setAccountnoId(int accountnoId) {
		this.accountnoId = accountnoId;
	}

	public int getAccountLength() {
		return this.accountLength;
	}

	public void setAccountLength(int accountLength) {
		this.accountLength = accountLength;
	}

}