package com.gt2software.ecommerce.repository.appUser;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt2software.ecommerce.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
