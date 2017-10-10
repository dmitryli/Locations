package com.olivebranch.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.olivebranch.enums.UserStatus;

/**
 * @author dmitrilimonov
 *
 */
@Entity
@Table(name = "TENANTS_USERS")
public class TenantUser {

	@Id
	@GeneratedValue
	private Long id = null;
	private Long tenantId = null;
	private String name = null;
	private String lastName = null;
	private String email = null;
	private UserStatus status = null;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean isActive() {
		return (getStatus() != null) && (getStatus().equals(UserStatus.ACTIVE));
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

}
