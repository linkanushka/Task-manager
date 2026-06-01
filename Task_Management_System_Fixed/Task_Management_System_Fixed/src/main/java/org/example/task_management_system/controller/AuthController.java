package org.example.task_management_system.controller;

import org.example.task_management_system.dto.LoginRequest;
import org.example.task_management_system.dto.LoginResponse;
import org.example.task_management_system.dto.RegisterRequest;
import org.example.task_management_system.entity.User;
import org.example.task_management_system.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}