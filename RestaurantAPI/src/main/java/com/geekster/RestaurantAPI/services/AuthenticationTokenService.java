package com.geekster.RestaurantAPI.services;

import com.geekster.RestaurantAPI.models.AuthenticationToken;
import com.geekster.RestaurantAPI.repositories.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {
    @Autowired
    private IAuthenticationTokenRepo authenticationTokenRepo;

    public void saveToken(AuthenticationToken token) {
        authenticationTokenRepo.save(token);
    }
}
