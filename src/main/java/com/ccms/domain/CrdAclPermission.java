package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the crd_acl_permissions database table.
 * 
 */
@Entity
@Table(name="crd_acl_permissions")
@NamedQuery(name="CrdAclPermission.findAll", query="SELECT c FROM CrdAclPermission c")
public class CrdAclPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_date")
	private Date modifiedDate;

	private String permission;

	//bi-directional many-to-one association to CrdAclRole
	@ManyToOne
	@JoinColumn(name="role_id")
	private CrdAclRole crdAclRole;

	//bi-directional many-to-one association to CrdAclResource
	@ManyToOne
	@JoinColumn(name="resource_id")
	private CrdAclResource crdAclResource;

	public CrdAclPermission() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public CrdAclRole getCrdAclRole() {
		return this.crdAclRole;
	}

	public void setCrdAclRole(CrdAclRole crdAclRole) {
		this.crdAclRole = crdAclRole;
	}

	public CrdAclResource getCrdAclResource() {
		return this.crdAclResource;
	}

	public void setCrdAclResource(CrdAclResource crdAclResource) {
		this.crdAclResource = crdAclResource;
	}

}