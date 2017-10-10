package com.olivebranch.service.tenant.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivebranch.domain.TenantAdmin;

@Service
public class TenantAdminServiceImpl implements TenantAdminService {

	private final static Logger log = LoggerFactory.getLogger(TenantAdminServiceImpl.class);

	@Autowired
	private TenantAdminRepository tenantAdminRepository = null;

	@Override
	public TenantAdmin createTenantAdmin(TenantAdmin t) {

		return tenantAdminRepository.save(t);
	}

	@Override
	public TenantAdmin findTenantAdminById(Long id, Long tenantId) {
		TenantAdmin t = tenantAdminRepository.findOne(id);
		if (t == null) {
			log.info("No tenant admin with id {} is found", id);
		}
		return t;
	}

	// @Override
	// public Tenant createTenant(Tenant t) {
	//
	// return tenantRepository.save(t);
	// }
	//
	// @Override
	// public Tenant findTenantById(Long id) {
	// Tenant t = tenantRepository.findOne(id);
	//
	// if (t == null) {
	// log.info("No tenant with id {} is found", id);
	// }
	// return t;
	// }

}
