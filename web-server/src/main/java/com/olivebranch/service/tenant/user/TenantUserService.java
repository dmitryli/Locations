package com.olivebranch.service.tenant.user;

import java.util.List;

import com.olivebranch.domain.TenantUser;
import com.olivebranch.domain.TenantUserLocation;
import com.olivebranch.enums.UserStatus;
import com.olivebranch.exceptions.NoTenantFoundException;

public interface TenantUserService {

	public TenantUser createUser(TenantUser u);

	public TenantUser findTenantUserById(Long id, Long tenantId);

	public List<TenantUserLocation> findTenantUserLocations(Long id, Long tenantId);

	public TenantUser findUserByEmail(String email) throws NoTenantFoundException;

	public TenantUser updateUserStatus(Long id, Long tenantId, UserStatus status);

	public UserStatus getUserStatus(Long id, Long tenantId);

}