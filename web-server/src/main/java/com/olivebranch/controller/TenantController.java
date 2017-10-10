package com.olivebranch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.Tenant;
import com.olivebranch.service.tenant.TenantService;

@RestController
@CrossOrigin(origins = "*")
public class TenantController {

	@Autowired
	private TenantService tenantService = null;

	@RequestMapping(path = "/tenants", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Tenant createTenant(@RequestBody Tenant t) {
		return tenantService.createTenant(t);
	}

	@RequestMapping(path = "/tenants/{id}", method = RequestMethod.GET, produces = "application/json")
	public Tenant findTenantById(@PathVariable("id") Long id) {
		return tenantService.findTenantById(id);
	}
}
