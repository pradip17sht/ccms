package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


/**
 * The persistent class for the crd_traffic database table.
 * 
 */
@Entity
@Table(name="crd_traffic")
@NamedQuery(name="CrdTraffic.findAll", query="SELECT c FROM CrdTraffic c")
public class CrdTraffic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="traffic_id")
	private int trafficId;

	@NotBlank
	private String currency;

	private String status;

	@Column(name="traffic_code")
	@NotBlank
	private String trafficCode;

	@Column(name="traffic_name")
	@NotBlank
	private String trafficName;

	public CrdTraffic() {
	}

	public int getTrafficId() {
		return this.trafficId;
	}

	public void setTrafficId(int trafficId) {
		this.trafficId = trafficId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTrafficCode() {
		return this.trafficCode;
	}

	public void setTrafficCode(String trafficCode) {
		this.trafficCode = trafficCode;
	}

	public String getTrafficName() {
		return this.trafficName;
	}

	public void setTrafficName(String trafficName) {
		this.trafficName = trafficName;
	}

}