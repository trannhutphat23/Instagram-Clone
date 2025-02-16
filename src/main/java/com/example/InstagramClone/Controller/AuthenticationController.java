package com.example.InstagramClone.Controller;

import com.example.InstagramClone.DTO.UserDto;
import com.example.InstagramClone.Service.AuthenticationService;
import com.example.InstagramClone.Service.ServiceImpl.AuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
    private UserDto userDto;

    @PostMapping("/signup")
    public Object signup(@RequestBody UserDto userDto){
        return authenticationService.signup(userDto);
    }
}
