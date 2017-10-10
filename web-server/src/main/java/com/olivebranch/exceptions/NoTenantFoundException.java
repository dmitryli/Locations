package com.olivebranch.exceptions;

public class NoTenantFoundException extends Exception {
    public NoTenantFoundException(String userEmail) {
        super(String.format("No tenant user with email %s is found", userEmail));
    }
}
