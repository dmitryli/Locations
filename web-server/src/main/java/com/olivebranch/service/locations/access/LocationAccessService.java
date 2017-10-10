package com.olivebranch.service.locations.access;

import com.olivebranch.domain.LocationAccess;

public interface LocationAccessService {

	LocationAccess verifyUserAccessToLocation(Long userId, Long tenantId, Long locationId);

}