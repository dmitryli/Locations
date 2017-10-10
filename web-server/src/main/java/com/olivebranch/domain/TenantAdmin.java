package com.olivebranch.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.olivebranch.enums.UserStatus;

@Entity
@Table(name = "TENANTS_ADMINS")
public class TenantAdmin {

	@Id
	@GeneratedValue
	private Long id = null;
	private Long tenantId = null;
	private String name = null;
	private String lastName = null;
	private String password = null;
	private String email = null;
	private UserStatus status = null;
	private Boolean createLocations = null;
	private Boolean deleteLocations = null;
	private Boolean createUsers = null;
	private Boolean deleteUsers = null;
	private Boolean createAdmins = null;
	private Boolean deleteAdmins = null;
	private Boolean changeUserStatus = null;
	private Boolean changeGuestStatus = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Boolean getCreateUsers() {
		return createUsers;
	}

	public void setCreateUsers(Boolean createUsers) {
		this.createUsers = createUsers;
	}

	public Boolean getDeleteUsers() {
		return deleteUsers;
	}

	public void setDeleteUsers(Boolean deleteUsers) {
		this.deleteUsers = deleteUsers;
	}

	public Boolean getCreateAdmins() {
		return createAdmins;
	}

	public void setCreateAdmins(Boolean createAdmins) {
		this.createAdmins = createAdmins;
	}

	public Boolean getDeleteAdmins() {
		return deleteAdmins;
	}

	public void setDeleteAdmins(Boolean deleteAdmins) {
		this.deleteAdmins = deleteAdmins;
	}

	public Boolean getChangeUserStatus() {
		return changeUserStatus;
	}

	public void setChangeUserStatus(Boolean changeUserStatus) {
		this.changeUserStatus = changeUserStatus;
	}

	public Boolean getCreateLocations() {
		return createLocations;
	}

	public void setCreateLocations(Boolean createLocations) {
		this.createLocations = createLocations;
	}

	public Boolean getDeleteLocations() {
		return deleteLocations;
	}

	public void setDeleteLocations(Boolean deleteLocations) {
		this.deleteLocations = deleteLocations;
	}

	public Boolean getChangeGuestStatus() {
		return changeGuestStatus;
	}

	public void setChangeGuestStatus(Boolean changeGuestStatus) {
		this.changeGuestStatus = changeGuestStatus;
	}

}
