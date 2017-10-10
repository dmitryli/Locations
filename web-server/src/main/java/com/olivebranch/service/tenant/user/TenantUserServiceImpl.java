package com.olivebranch.service.tenant.user;

import java.util.List;

import com.olivebranch.exceptions.NoTenantFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivebranch.domain.TenantUser;
import com.olivebranch.domain.TenantUserLocation;
import com.olivebranch.enums.UserStatus;

@Service
public class TenantUserServiceImpl implements TenantUserService {

	private final static Logger log = LoggerFactory.getLogger(TenantUserServiceImpl.class);

	@Autowired
	private TenantUserRepository tenantUserRepository = null;

	@Autowired
	private TenantUserLocationsRepository tenantUserLocationsRepository = null;

	public TenantUser createUser(TenantUser u) {

		return tenantUserRepository.save(u);
	}

	@Override
	public TenantUser findTenantUserById(Long id, Long tenantId) {
		TenantUser t = tenantUserRepository.findOne(id);

		if (t == null) {
			log.info("No tenant user with id {} is found", id);
		}
		return t;
	}

	@Override
	public List<TenantUserLocation> findTenantUserLocations(Long id, Long tenantId) {
		List<TenantUserLocation> userLocations = tenantUserLocationsRepository.findUserLocations(tenantId, id);

		if (userLocations == null) {
			log.info("No tenant user with id {} is found", id);
		}
		return userLocations;
	}

	@Override
	public TenantUser findUserByEmail(String email) throws NoTenantFoundException {
		TenantUser t = tenantUserRepository.findUserByEmail(email);

		if (t == null) {
			log.info("No tenant user with id {} is found", email);
			throw new NoTenantFoundException(email);
		}

		TenantUser response = new TenantUser();
		response.setId(t.getId());
		response.setTenantId(t.getTenantId());
		return response;
	}

	@Override
	public TenantUser updateUserStatus(Long id, Long tenantId, UserStatus status) {
		TenantUser user = findTenantUserById(id, tenantId);

		if (user != null) {
			user.setStatus(status);
			user = tenantUserRepository.save(user);
		}

		return user;
	}

	@Override
	public UserStatus getUserStatus(Long id, Long tenantId) {
		TenantUser user = findTenantUserById(id, tenantId);

		if (user != null) {
			return user.getStatus();
		}

		return null;
	}
}
