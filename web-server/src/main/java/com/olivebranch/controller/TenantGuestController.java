package com.olivebranch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.TenantGuest;
import com.olivebranch.service.tenant.guest.TenantGuestService;

@RestController
@CrossOrigin(origins = "*")
public class TenantGuestController {

	@Autowired
	private TenantGuestService tenantGuestService = null;

	@RequestMapping(path = "/tenants/{tenantId}/users/{userId}/guests", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public TenantGuest createTenantUserGuest(@RequestBody TenantGuest u, @PathVariable("tenantId") Long tenantId,
			@PathVariable("userId") Long userId) {
		u.setTenantId(tenantId);
		u.setUserId(userId);
		return tenantGuestService.createGuest(u);
	}

	@RequestMapping(path = "/tenants/{tenantId}/users/{userId}/guests", method = RequestMethod.GET, produces = "application/json")
	public List<TenantGuest> findTenantUserGuests(@PathVariable("tenantId") Long tenantId,
			@PathVariable("userId") Long userId) {
		return tenantGuestService.findTenantUserGuests(tenantId, userId);
	}

	@RequestMapping(path = "/tenants/{tenantId}/users/{userId}/guests/{id}", method = RequestMethod.GET, produces = "application/json")
	public TenantGuest findTenantUserGuestById(@PathVariable("id") Long id, @PathVariable("tenantId") Long tenantId,
			@PathVariable("userId") Long userId) {
		return tenantGuestService.findTenantGuestById(id, tenantId, userId);
	}
}
