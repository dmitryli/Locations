package com.olivebranch.service.tenant.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.olivebranch.domain.TenantUser;

public interface TenantUserRepository extends CrudRepository<TenantUser, Long> {

	@Query("from TenantUser where email =:email")
	TenantUser findUserByEmail(@Param("email") String email);
}