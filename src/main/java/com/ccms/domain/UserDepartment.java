package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the user_department database table.
 * 
 */
@Entity
@Table(name="user_department")
@NamedQuery(name="UserDepartment.findAll", query="SELECT u FROM UserDepartment u")
public class UserDepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_id")
	private int departmentId;

	@Column(name="branch_code", length = 4)
	@NotBlank
	private String branchCode;

	@Column(name="department_name")
	@NotBlank
	private String departmentName;

	public UserDepartment() {
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}