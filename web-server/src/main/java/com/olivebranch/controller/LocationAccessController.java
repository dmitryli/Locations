package com.olivebranch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.LocationAccess;
import com.olivebranch.service.locations.access.LocationAccessService;

@RestController
@CrossOrigin(origins = "*")
public class LocationAccessController {

	@Autowired
	private LocationAccessService locationAccessService = null;

	@RequestMapping(path = "/location-access/{userId}", method = RequestMethod.GET, produces = "application/json")
	public LocationAccess findTenantUserLocationsById(@PathVariable("userId") Long userId,
			@RequestParam("tenantId") Long tenantId, @RequestParam("locationId") Long locationId) {
		return locationAccessService.verifyUserAccessToLocation(userId, tenantId, locationId);
	}

}
