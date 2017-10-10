package com.olivebranch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.TenantAdmin;
import com.olivebranch.service.tenant.admin.TenantAdminService;

@RestController
@CrossOrigin(origins = "*")
public class TenantAdminController {

	@Autowired
	private TenantAdminService tenantAdminService = null;

	@RequestMapping(path = "/tenants/{tenantId}/admins", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public TenantAdmin createTenantAdmin(@RequestBody TenantAdmin ta, @PathVariable("tenantId") Long tenantId) {
		ta.setTenantId(tenantId);
		return tenantAdminService.createTenantAdmin(ta);
	}

	@RequestMapping(path = "/tenants/{tenantId}/admins/{id}", method = RequestMethod.GET, produces = "application/json")
	public TenantAdmin findTenantAdminById(@PathVariable("id") Long id, @PathVariable("tenantId") Long tenantId) {
		return tenantAdminService.findTenantAdminById(id, tenantId);
	}
}
