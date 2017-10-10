package com.olivebranch.service.tenant;

import org.springframework.data.repository.CrudRepository;

import com.olivebranch.domain.Tenant;

public interface TenantRepository extends CrudRepository<Tenant, Long> {

}
