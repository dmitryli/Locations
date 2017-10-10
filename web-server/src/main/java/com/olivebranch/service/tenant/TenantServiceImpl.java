package com.olivebranch.service.tenant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivebranch.domain.Tenant;

@Service
public class TenantServiceImpl implements TenantService {

	private final static Logger log = LoggerFactory.getLogger(TenantServiceImpl.class);
	@Autowired
	private TenantRepository tenantRepository = null;

	@Override
	public Tenant createTenant(Tenant t) {

		return tenantRepository.save(t);
	}

	@Override
	public Tenant findTenantById(Long id) {
		Tenant t = tenantRepository.findOne(id);

		if (t == null) {
			log.info("No tenant with id {} is found", id);
		}
		return t;
	}

}
