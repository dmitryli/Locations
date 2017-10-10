package com.olivebranch.domain;

import java.time.LocalDateTime;

public class LocationAccess {
	private Boolean isAllowed = false;
	private LocalDateTime expiration = null;

	public Boolean getIsAllowed() {
		return isAllowed;
	}

	public void setIsAllowed(Boolean isAllowed) {
		this.isAllowed = isAllowed;
	}

	public LocalDateTime getExpiration() {
		return expiration;
	}

	public void setExpiration(LocalDateTime expiration) {
		this.expiration = expiration;
	}

}
