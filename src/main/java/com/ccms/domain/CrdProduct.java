package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


/**
 * The persistent class for the crd_product database table.
 * 
 */
@Entity
@Table(name="crd_product")
@NamedQuery(name="CrdProduct.findAll", query="SELECT c FROM CrdProduct c")
public class CrdProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private int productId;

	@NotBlank
	private String currency;

	@Column(name="product_code")
	@NotBlank
	private String productCode;

	@Column(name="product_name")
	@NotBlank
	private String productName;

	private String status;

	public CrdProduct() {
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}