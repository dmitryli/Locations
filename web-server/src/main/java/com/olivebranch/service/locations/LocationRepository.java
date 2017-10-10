package com.olivebranch.service.locations;

import org.springframework.data.repository.CrudRepository;

import com.olivebranch.domain.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}
