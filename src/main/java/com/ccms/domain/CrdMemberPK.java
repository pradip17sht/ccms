package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the crd_member database table.
 * 
 */
@Embeddable
public class CrdMemberPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="member_id")
	private int memberId;

	@Column(name="client_code")
	private String clientCode;

	public CrdMemberPK() {
	}
	public int getMemberId() {
		return this.memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getClientCode() {
		return this.clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CrdMemberPK)) {
			return false;
		}
		CrdMemberPK castOther = (CrdMemberPK)other;
		return 
			(this.memberId == castOther.memberId)
			&& this.clientCode.equals(castOther.clientCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.memberId;
		hash = hash * prime + this.clientCode.hashCode();
		
		return hash;
	}
}