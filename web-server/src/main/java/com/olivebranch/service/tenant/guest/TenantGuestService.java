package com.olivebranch.service.tenant.guest;

import java.util.List;

import com.olivebranch.domain.TenantGuest;

public interface TenantGuestService {
	public TenantGuest createGuest(TenantGuest u);

	public TenantGuest findTenantGuestById(Long id, Long tenantId, Long userId);

	public List<TenantGuest> findTenantUserGuests(Long tenantId, Long userId);

}