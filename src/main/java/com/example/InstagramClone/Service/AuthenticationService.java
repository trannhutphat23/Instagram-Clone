package com.example.InstagramClone.Service;

import com.example.InstagramClone.DTO.UserDto;

public interface AuthenticationService {
    Object signup(UserDto userDto);
}