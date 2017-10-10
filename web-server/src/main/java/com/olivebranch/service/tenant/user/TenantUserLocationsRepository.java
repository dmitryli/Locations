package com.olivebranch.service.tenant.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.olivebranch.domain.TenantUserLocation;

public interface TenantUserLocationsRepository extends CrudRepository<TenantUserLocation, Long> {

	@Query("from TenantUserLocation where tenantId =:tenantId and userId =:userId")
	List<TenantUserLocation> findUserLocations(@Param("tenantId") Long tenantId, @Param("userId") Long userId);
}
