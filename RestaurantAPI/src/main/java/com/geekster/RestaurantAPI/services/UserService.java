package com.geekster.RestaurantAPI.services;

import com.geekster.RestaurantAPI.dto.SignInInput;
import com.geekster.RestaurantAPI.models.AuthenticationToken;
import com.geekster.RestaurantAPI.models.User;
import com.geekster.RestaurantAPI.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;
    @Autowired
    private AuthenticationTokenService authenticationTokenService;

    public String encryptPassword(String password){
        String encryptedPassword = "##" + password + "##";
        return encryptedPassword;
    }

    public String signUp(User user) {
        User checkUser = userRepo.findByUserEmail(user.getUserEmail());
        if(checkUser != null){
            throw new IllegalStateException("User already exits...");
        }

        String encryptedPassword = "";
        encryptedPassword = encryptPassword(user.getPassword());

        user.setPassword(encryptedPassword);
        userRepo.save(user);
        return "user saved";
    }


    public String signIn(SignInInput signInInput) {
        User checkUser = userRepo.findByUserEmail(signInInput.getUserEmail());
        if (checkUser == null){
            throw new IllegalStateException("User not Registered... Sign Up first!!!");
        }

        String encryptedPassword = "";
        encryptedPassword = encryptPassword(signInInput.getPassword());

        boolean isValid = encryptedPassword.equals(checkUser.getPassword());
        if(!isValid){
            throw new IllegalStateException("Invalid user...");
        }

        AuthenticationToken token = new AuthenticationToken(checkUser);
        authenticationTokenService.saveToken(token);

        return "signed in successfully Token is: " + token.getToken();
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User getUser(String email) {
        return userRepo.findByUserEmail(email);
    }
}
