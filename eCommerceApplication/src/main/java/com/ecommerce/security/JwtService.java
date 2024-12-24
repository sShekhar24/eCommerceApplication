package com.ecommerce.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private final JwtUtil jwtUtil;

    public JwtService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public String generateToken(UserDetails userDetails) {
        return jwtUtil.generateToken(userDetails.getUsername());
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return jwtUtil.validateToken(token, userDetails.getUsername());
    }

    // Add the extractUsername method to fetch the username from JWT
    public String extractUsername(String token) {
        return jwtUtil.extractUsername(token);
    }
}
