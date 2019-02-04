package com.ccms.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the crd_acl_roles database table.
 * 
 */
@Entity
@Table(name="crd_acl_roles")
@NamedQuery(name="CrdAclRole.findAll", query="SELECT c FROM CrdAclRole c")
public class CrdAclRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private int roleId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="role_name")
	private String roleName;

	//bi-directional many-to-one association to CrdAclPermission
	@OneToMany(mappedBy="crdAclRole")
	private List<CrdAclPermission> crdAclPermissions;

	public CrdAclRole() {
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<CrdAclPermission> getCrdAclPermissions() {
		return this.crdAclPermissions;
	}

	public void setCrdAclPermissions(List<CrdAclPermission> crdAclPermissions) {
		this.crdAclPermissions = crdAclPermissions;
	}

	public CrdAclPermission addCrdAclPermission(CrdAclPermission crdAclPermission) {
		getCrdAclPermissions().add(crdAclPermission);
		crdAclPermission.setCrdAclRole(this);

		return crdAclPermission;
	}

	public CrdAclPermission removeCrdAclPermission(CrdAclPermission crdAclPermission) {
		getCrdAclPermissions().remove(crdAclPermission);
		crdAclPermission.setCrdAclRole(null);

		return crdAclPermission;
	}

}