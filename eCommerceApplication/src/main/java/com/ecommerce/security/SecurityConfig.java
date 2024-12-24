package com.ecommerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final CustomUserDetailsService customUserDetailsService;

    public SecurityConfig(CustomUserDetailsService customUserDetailsService) {
        this.customUserDetailsService = customUserDetailsService;
    }

    // 1. Password Encoder (for hashing passwords)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 2. AuthenticationManager (Handles user authentication)
    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(customUserDetailsService)  // Load users from DB
                .passwordEncoder(passwordEncoder())            // Encode passwords
                .and()
                .build();
    }

    // 3. Security Rules for Endpoints
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())  // Disable CSRF for simplicity (enable if needed)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/login").permitAll()  // Allow login without auth
                .anyRequest().authenticated()  // Protect all other endpoints
            )
            .formLogin(login -> login.disable())  // Disable default login form
            .httpBasic(basic -> basic.disable()); // Disable basic auth
        return http.build();
    }
}
