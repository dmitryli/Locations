package com.olivebranch.service.tenant.guest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivebranch.domain.TenantGuest;

@Service
public class TenantGuestServiceImpl implements TenantGuestService {

	private final static Logger log = LoggerFactory.getLogger(TenantGuestServiceImpl.class);

	@Autowired
	private TenantGuestRepository tenantGuestRepository = null;

	public TenantGuest createGuest(TenantGuest u) {

		return tenantGuestRepository.save(u);
	}

	@Override
	public TenantGuest findTenantGuestById(Long id, Long tenantId, Long userId) {
		TenantGuest t = tenantGuestRepository.findOne(id);

		if (t == null) {
			log.info("No tenant guest with id {} is found", id);
		}
		return t;
	}

	@Override
	public List<TenantGuest> findTenantUserGuests(Long tenantId, Long userId) {
		return tenantGuestRepository.findTenantUserGuests(tenantId, userId);
	}
}
