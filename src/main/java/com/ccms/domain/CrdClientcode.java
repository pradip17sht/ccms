package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


/**
 * The persistent class for the crd_clientcode database table.
 * 
 */
@Entity
@Table(name="crd_clientcode")
@NamedQuery(name="CrdClientcode.findAll", query="SELECT c FROM CrdClientcode c")
public class CrdClientcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="clientcode_id")
	private int clientcodeId;

	@Column(name="clientcode_digits")
	private int clientcodeDigits;

	@Column(name="clientcode_type")
	@NotBlank 
	private String clientcodeType;

	public CrdClientcode() {
	}

	public int getClientcodeId() {
		return this.clientcodeId;
	}

	public void setClientcodeId(int clientcodeId) {
		this.clientcodeId = clientcodeId;
	}

	public int getClientcodeDigits() {
		return this.clientcodeDigits;
	}

	public void setClientcodeDigits(int clientcodeDigits) {
		this.clientcodeDigits = clientcodeDigits;
	}

	public String getClientcodeType() {
		return this.clientcodeType;
	}

	public void setClientcodeType(String clientcodeType) {
		this.clientcodeType = clientcodeType;
	}

}