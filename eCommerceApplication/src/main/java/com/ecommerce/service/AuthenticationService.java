package com.ecommerce.service;

public interface AuthenticationService {
    String login(String username, String password);
    void registerUser(User user);
}
