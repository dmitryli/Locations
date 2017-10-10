package com.olivebranch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.TenantUser;
import com.olivebranch.domain.TenantUserLocation;
import com.olivebranch.enums.UserStatus;
import com.olivebranch.service.tenant.user.TenantUserService;

@RestController
@CrossOrigin(origins = "*")
public class TenantUserController {

	@Autowired
	private TenantUserService tenantUserService = null;

	@RequestMapping(path = "/tenants/{tenantId}/users", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public TenantUser createTenantUser(@RequestBody TenantUser u, @PathVariable("tenantId") Long tenantId) {
		u.setTenantId(tenantId);
		return tenantUserService.createUser(u);
	}

	@RequestMapping(path = "/tenants/{tenantId}/users/{id}", method = RequestMethod.GET, produces = "application/json")
	public TenantUser findTenantUserById(@PathVariable("id") Long id, @PathVariable("tenantId") Long tenantId) {
		return tenantUserService.findTenantUserById(id, tenantId);
	}

	@RequestMapping(path = "/tenants/{tenantId}/users/{id}/status", method = RequestMethod.PUT, produces = "application/json")
	public TenantUser updateUserStatus(@PathVariable("id") Long id, @PathVariable("tenantId") Long tenantId,
			@RequestBody UserStatus status) {
		return tenantUserService.updateUserStatus(id, tenantId, status);
	}

	@RequestMapping(path = "/tenants/{tenantId}/users/{id}/status", method = RequestMethod.GET, produces = "application/json")
	public UserStatus getUserStatus(@PathVariable("id") Long id, @PathVariable("tenantId") Long tenantId) {
		return tenantUserService.getUserStatus(id, tenantId);
	}

	@RequestMapping(path = "/tenants/{tenantId}/users/{id}/locations", method = RequestMethod.GET, produces = "application/json")
	public List<TenantUserLocation> findTenantUserLocationsById(@PathVariable("id") Long id,
			@PathVariable("tenantId") Long tenantId) {
		return tenantUserService.findTenantUserLocations(id, tenantId);
	}

}
