package com.ducle.auth.service.service;

import com.ducle.auth.service.payload.LoginDto;
import com.ducle.auth.service.payload.RegisterDto;

public interface AuthService {
    public String login(LoginDto loginDto);
    public String register(RegisterDto registerDto);
    ;
}
