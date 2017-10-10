package com.olivebranch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olivebranch.domain.Location;
import com.olivebranch.service.locations.LocationService;

@RestController
@CrossOrigin(origins = "*")
public class LocationController {

	@Autowired
	private LocationService locationService = null;

	@RequestMapping(path = "/locations", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Location createLocation(@RequestBody Location l) {
		return locationService.createLocation(l);
	}

	@RequestMapping(path = "/locations/{id}", method = RequestMethod.GET, produces = "application/json")
	public Location findLocationById(@PathVariable("id") Long id) {
		return locationService.findLocationById(id);
	}
}
