package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the crd_acl_resources database table.
 * 
 */
@Entity
@Table(name="crd_acl_resources")
@NamedQuery(name="CrdAclResource.findAll", query="SELECT c FROM CrdAclResource c")
public class CrdAclResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="resource_id")
	private int resourceId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_date")
	private Date modifiedDate;

	private String resource;

	@Column(name="resource_module")
	private String resourceModule;

	//bi-directional many-to-one association to CrdAclPermission
	@OneToMany(mappedBy="crdAclResource")
	private List<CrdAclPermission> crdAclPermissions;

	public CrdAclResource() {
	}
	
	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
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

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getResourceModule() {
		return this.resourceModule;
	}

	public void setResourceModule(String resourceModule) {
		this.resourceModule = resourceModule;
	}

	public List<CrdAclPermission> getCrdAclPermissions() {
		return this.crdAclPermissions;
	}

	public void setCrdAclPermissions(List<CrdAclPermission> crdAclPermissions) {
		this.crdAclPermissions = crdAclPermissions;
	}

	public CrdAclPermission addCrdAclPermission(CrdAclPermission crdAclPermission) {
		getCrdAclPermissions().add(crdAclPermission);
		crdAclPermission.setCrdAclResource(this);

		return crdAclPermission;
	}

	public CrdAclPermission removeCrdAclPermission(CrdAclPermission crdAclPermission) {
		getCrdAclPermissions().remove(crdAclPermission);
		crdAclPermission.setCrdAclResource(null);

		return crdAclPermission;
	}

}