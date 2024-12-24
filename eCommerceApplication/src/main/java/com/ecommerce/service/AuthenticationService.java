package com.ecommerce.service;

import org.springframework.security.core.userdetails.User;

public interface AuthenticationService {
    String login(String username, String password);
    void registerUser(User user);
}
