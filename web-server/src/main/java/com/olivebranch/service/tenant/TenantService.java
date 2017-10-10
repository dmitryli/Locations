package com.olivebranch.service.tenant;

import com.olivebranch.domain.Tenant;

public interface TenantService {

	Tenant createTenant(Tenant t);

	Tenant findTenantById(Long id);

}
