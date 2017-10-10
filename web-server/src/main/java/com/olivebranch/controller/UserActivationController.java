package com.olivebranch.controller;

import com.olivebranch.exceptions.NoTenantFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.TenantUser;
import com.olivebranch.service.tenant.user.TenantUserService;

@RestController
@CrossOrigin(origins = "*")
public class UserActivationController {

	@Autowired
	private TenantUserService tenantUserService = null;

	@RequestMapping(path = "/users", method = RequestMethod.GET, produces = "application/json")
	@ExceptionHandler(NoTenantFoundException.class)
	public TenantUser findUserByEmail(@RequestParam("email") String email) throws NoTenantFoundException {
		return tenantUserService.findUserByEmail(email);
	}

}
