package com.wipro.jwtapp.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jwtapp.model.AuthRequest;
import com.wipro.jwtapp.model.AuthResponse;
import com.wipro.jwtapp.service.JwtService;

@RestController
public class AuthController {

    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthController(JwtService jwtService, AuthenticationManager authManager) {
        this.jwtService = jwtService;
        this.authManager = authManager;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        try {
            authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );
        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid username/password");
        }
        String token = jwtService.generateToken(request.getUsername());
        return new AuthResponse(token);
    }
}