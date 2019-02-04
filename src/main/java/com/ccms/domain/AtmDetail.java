package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the atm_details database table.
 * 
 */
@Entity
@Table(name="atm_details")
@NamedQuery(name="AtmDetail.findAll", query="SELECT a FROM AtmDetail a")
public class AtmDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int dataCount;

	@Column(name="del_flg")
	private String delFlg;

	private String endtime;

	@Lob
	private String filename;

	private String starttime;

	@Lob
	private String terminalid;

	@Lob
	private String uploadedby;

	private String uploadeddate;

	public AtmDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDataCount() {
		return this.dataCount;
	}

	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}

	public String getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getTerminalid() {
		return this.terminalid;
	}

	public void setTerminalid(String terminalid) {
		this.terminalid = terminalid;
	}

	public String getUploadedby() {
		return this.uploadedby;
	}

	public void setUploadedby(String uploadedby) {
		this.uploadedby = uploadedby;
	}

	public String getUploadeddate() {
		return this.uploadeddate;
	}

	public void setUploadeddate(String uploadeddate) {
		this.uploadeddate = uploadeddate;
	}

}