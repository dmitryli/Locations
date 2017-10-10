package com.olivebranch.service.tenant.guest;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.olivebranch.domain.TenantGuest;

public interface TenantGuestRepository extends CrudRepository<TenantGuest, Long> {

	@Query("from TenantGuest where tenantId =:tenantId and userId =:userId")
	public List<TenantGuest> findTenantUserGuests(@Param("tenantId") Long tenantId, @Param("userId") Long userId);
}
