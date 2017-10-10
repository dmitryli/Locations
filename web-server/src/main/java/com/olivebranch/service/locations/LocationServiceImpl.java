package com.olivebranch.service.locations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivebranch.domain.Location;

@Service
public class LocationServiceImpl implements LocationService {

	private final static Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);

	@Autowired
	private LocationRepository locationRepository = null;

	@Override
	public Location createLocation(Location l) {

		return locationRepository.save(l);
	}

	@Override
	public Location findLocationById(Long id) {
		Location l = locationRepository.findOne(id);
		if (l == null) {
			log.info("No tenant with id {} is found", id);
		}

		return l;
	}

}
