package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;


/**
 * The persistent class for the crd_branch database table.
 * 
 */
@Entity
@Table(name="crd_branch")
@NamedQuery(name="CrdBranch.findAll", query="SELECT c FROM CrdBranch c")
public class CrdBranch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="branch_id")
	private int branchId;

	@Column(name="branch_code", length = 4)
	@NotBlank
	private String branchCode;

	@Column(name="branch_name")
	@NotBlank
	private String branchName;

	public CrdBranch() {
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}