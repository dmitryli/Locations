package com.olivebranch.service.tenant.admin;

import com.olivebranch.domain.TenantAdmin;

public interface TenantAdminService {

	TenantAdmin createTenantAdmin(TenantAdmin t);

	TenantAdmin findTenantAdminById(Long id, Long tenantId);

}
