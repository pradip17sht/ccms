package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the crd_member database table.
 * 
 */
@Entity
@Table(name="crd_member")
@NamedQuery(name="CrdMember.findAll", query="SELECT c FROM CrdMember c")
public class CrdMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CrdMemberPK id;

	@Column(name="acc_type")
	private String accType;
 
	@Column(name="account_currency")
	private String accountCurrency;

	@Column(name="account_number")
	private String accountNumber;

	@Column(name="action_code")
	private String actionCode;

	@Lob
	private String address;

	@Column(name="application_date")
	private String applicationDate;

	@Column(name="bank_code")
	private String bankCode;

	@Column(name="branch_code")
	private String branchCode;

	@Column(name="card_flag")
	private String cardFlag;

	@Column(name="card_status")
	private String cardStatus;

	@Column(name="check_sum")
	private String checkSum;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="contract_start_date")
	private String contractStartDate;

	@Column(name="country_code")
	private String countryCode;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="delivery_code")
	private String deliveryCode;

	@Column(name="delivery_date")
	private String deliveryDate;

	@Column(name="delivery_mode")
	private String deliveryMode;

	private String dob;

	private String downloadfilename;

	private String email;

	@Column(name="embossed_name")
	private String embossedName;

	@Column(name="encoded_name")
	private String encodedName;

	@Column(name="family_name")
	private String familyName;

	@Column(name="first_name")
	private String firstName;

	@Column(name="issuer_client")
	private String issuerClient;

	@Column(name="mailing_address1")
	private String mailingAddress1;

	@Column(name="mailing_city_code")
	private String mailingCityCode;

	@Column(name="mailing_country_code")
	private String mailingCountryCode;

	@Column(name="mailing_zip_code")
	private String mailingZipCode;

	@Column(name="marital_status")
	private String maritalStatus;

	@Column(name="marital_status1")
	private String maritalStatus1;

	@Column(name="nationality_code")
	private String nationalityCode;

	@Column(name="open_date")
	private String openDate;

	@Column(name="ph_indicator")
	private String phIndicator;

	@Column(name="phone_alternative")
	private String phoneAlternative;

	@Column(name="phone_home")
	private String phoneHome;

	private String phone1;

	private String phone2;

	@Column(name="product_code")
	private String productCode;

	@Column(name="residence_status")
	private String residenceStatus;

	@Column(name="start_date")
	private String startDate;

	private String status;

	@Column(name="status_code")
	private String statusCode;

	private String title;

	@Column(name="traffic_code")
	private String trafficCode;

	@Column(name="uploaded_branch_code")
	private String uploadedBranchCode;

	@Column(name="uploaded_by")
	private int uploadedBy;

	@Column(name="verified_by")
	private int verifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="verified_date")
	private Date verifiedDate;

	@Lob
	@Column(name="verifier_comment")
	private String verifierComment;

	@Column(name="verify_status")
	private String verifyStatus;

	@Column(name="zip_code")
	private String zipCode;

	public CrdMember() {
	}

	public CrdMemberPK getId() {
		return this.id;
	}

	public void setId(CrdMemberPK id) {
		this.id = id;
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccountCurrency() {
		return this.accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApplicationDate() {
		return this.applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCardFlag() {
		return this.cardFlag;
	}

	public void setCardFlag(String cardFlag) {
		this.cardFlag = cardFlag;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCheckSum() {
		return this.checkSum;
	}

	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContractStartDate() {
		return this.contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDeliveryCode() {
		return this.deliveryCode;
	}

	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}

	public String getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryMode() {
		return this.deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDownloadfilename() {
		return this.downloadfilename;
	}

	public void setDownloadfilename(String downloadfilename) {
		this.downloadfilename = downloadfilename;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmbossedName() {
		return this.embossedName;
	}

	public void setEmbossedName(String embossedName) {
		this.embossedName = embossedName;
	}

	public String getEncodedName() {
		return this.encodedName;
	}

	public void setEncodedName(String encodedName) {
		this.encodedName = encodedName;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIssuerClient() {
		return this.issuerClient;
	}

	public void setIssuerClient(String issuerClient) {
		this.issuerClient = issuerClient;
	}

	public String getMailingAddress1() {
		return this.mailingAddress1;
	}

	public void setMailingAddress1(String mailingAddress1) {
		this.mailingAddress1 = mailingAddress1;
	}

	public String getMailingCityCode() {
		return this.mailingCityCode;
	}

	public void setMailingCityCode(String mailingCityCode) {
		this.mailingCityCode = mailingCityCode;
	}

	public String getMailingCountryCode() {
		return this.mailingCountryCode;
	}

	public void setMailingCountryCode(String mailingCountryCode) {
		this.mailingCountryCode = mailingCountryCode;
	}

	public String getMailingZipCode() {
		return this.mailingZipCode;
	}

	public void setMailingZipCode(String mailingZipCode) {
		this.mailingZipCode = mailingZipCode;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalStatus1() {
		return this.maritalStatus1;
	}

	public void setMaritalStatus1(String maritalStatus1) {
		this.maritalStatus1 = maritalStatus1;
	}

	public String getNationalityCode() {
		return this.nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}

	public String getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getPhIndicator() {
		return this.phIndicator;
	}

	public void setPhIndicator(String phIndicator) {
		this.phIndicator = phIndicator;
	}

	public String getPhoneAlternative() {
		return this.phoneAlternative;
	}

	public void setPhoneAlternative(String phoneAlternative) {
		this.phoneAlternative = phoneAlternative;
	}

	public String getPhoneHome() {
		return this.phoneHome;
	}

	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getResidenceStatus() {
		return this.residenceStatus;
	}

	public void setResidenceStatus(String residenceStatus) {
		this.residenceStatus = residenceStatus;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrafficCode() {
		return this.trafficCode;
	}

	public void setTrafficCode(String trafficCode) {
		this.trafficCode = trafficCode;
	}

	public String getUploadedBranchCode() {
		return this.uploadedBranchCode;
	}

	public void setUploadedBranchCode(String uploadedBranchCode) {
		this.uploadedBranchCode = uploadedBranchCode;
	}

	public int getUploadedBy() {
		return this.uploadedBy;
	}

	public void setUploadedBy(int uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public int getVerifiedBy() {
		return this.verifiedBy;
	}

	public void setVerifiedBy(int verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public Date getVerifiedDate() {
		return this.verifiedDate;
	}

	public void setVerifiedDate(Date verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public String getVerifierComment() {
		return this.verifierComment;
	}

	public void setVerifierComment(String verifierComment) {
		this.verifierComment = verifierComment;
	}

	public String getVerifyStatus() {
		return this.verifyStatus;
	}

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}