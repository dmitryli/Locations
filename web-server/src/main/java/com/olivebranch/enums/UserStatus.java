package com.olivebranch.enums;

public enum UserStatus {

	INACTIVE(0), ACTIVE(1), SUSPENDED(2);

	private int status = 0;

	private UserStatus(int i) {
		status = i;
	}

	public int getStatusNumericValue() {
		return status;
	}

	public static UserStatus getStatusFromNumericValue(int i) {
		return UserStatus.values()[i];
	}

}
