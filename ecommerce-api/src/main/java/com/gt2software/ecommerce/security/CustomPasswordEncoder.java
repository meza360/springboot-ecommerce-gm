package com.gt2software.ecommerce.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {

    private final Logger logger = LoggerFactory.getLogger(CustomPasswordEncoder.class);

    @Override
    public String encode(CharSequence rawPassword) {
        logger.info("=========================ENCODE");
        logger.debug(rawPassword.toString());
        logger.debug("=========================ENCODE");
        return new BCryptPasswordEncoder().encode(rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        logger.debug("=========================MATCH");
        logger.debug(rawPassword.toString());
        logger.debug("=========================MATCH");
        logger.debug(encodedPassword);
        logger.debug("=========================MATCH");
        return new BCryptPasswordEncoder().matches(rawPassword, encodedPassword);
    }
}
