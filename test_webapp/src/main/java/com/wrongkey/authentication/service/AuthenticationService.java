package com.wrongkey.authentication.service;

import com.wrongkey.authentication.dao.AuthenticationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
    @Autowired
    private AuthenticationDao authenticationDao;
}
