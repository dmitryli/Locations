package com.olivebranch.service.locations.access;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivebranch.domain.LocationAccess;
import com.olivebranch.domain.TenantUser;
import com.olivebranch.domain.TenantUserLocation;
import com.olivebranch.service.tenant.user.TenantUserService;

@Service
public class LocationAccessServiceImpl implements LocationAccessService {

	@Autowired
	private TenantUserService tenantUserService = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.olivebranch.service.locations.access.LocationAccessService#
	 * verifyUserAccessToLocation(java.lang.Long, java.lang.Long,
	 * java.lang.Long)
	 */
	@Override
	public LocationAccess verifyUserAccessToLocation(Long userId, Long tenantId, Long locationId) {
		LocationAccess access = new LocationAccess();

		TenantUser user = tenantUserService.findTenantUserById(userId, tenantId);

		List<TenantUserLocation> locations = tenantUserService.findTenantUserLocations(userId, tenantId);

		TenantUserLocation currentLocation = null;
		if (user != null && user.isActive()) {
			Optional<TenantUserLocation> first = locations.stream()
					.filter(location -> location.getLocationId().equals(locationId)).findFirst();
			if (first.isPresent()) {
				currentLocation = first.get();
				if (currentLocation != null && currentLocation.getEndTime().isAfter(LocalDateTime.now())) {
					access.setExpiration(currentLocation.getEndTime());
					access.setIsAllowed(Boolean.TRUE);
				}
			}
		}
		return access;
	}
}
