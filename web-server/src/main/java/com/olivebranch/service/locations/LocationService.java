package com.olivebranch.service.locations;

import com.olivebranch.domain.Location;

public interface LocationService {

	Location createLocation(Location l);

	Location findLocationById(Long id);
}
