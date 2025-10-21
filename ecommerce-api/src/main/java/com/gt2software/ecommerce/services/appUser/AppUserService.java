package com.gt2software.ecommerce.services.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gt2software.ecommerce.model.AppUser;
import com.gt2software.ecommerce.repository.appUser.AppUserRepository;

public class AppUserService implements IAppUser {

    // @Autowired
    // private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private AppUserRepository userRepository;

    @Override
    public void registerAppUser(AppUser appUser) {
        // appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        userRepository.save(appUser);
    }
}
