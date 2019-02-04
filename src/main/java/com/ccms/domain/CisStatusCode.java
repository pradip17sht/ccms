package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


/**
 * The persistent class for the cis_status_code database table.
 * 
 */
@Entity
@Table(name="cis_status_code")
@NamedQuery(name="CisStatusCode.findAll", query="SELECT c FROM CisStatusCode c")
public class CisStatusCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="status_code_id")
	private int statusCodeId;

	@Column(name="status_code")
	@NotBlank
	private int statusCode;

	@Column(name="status_code_title")
	@NotBlank
	private String statusCodeTitle;

	public CisStatusCode() {
	}

	public int getStatusCodeId() {
		return this.statusCodeId;
	}

	public void setStatusCodeId(int statusCodeId) {
		this.statusCodeId = statusCodeId;
	}

	public int getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusCodeTitle() {
		return this.statusCodeTitle;
	}

	public void setStatusCodeTitle(String statusCodeTitle) {
		this.statusCodeTitle = statusCodeTitle;
	}

}