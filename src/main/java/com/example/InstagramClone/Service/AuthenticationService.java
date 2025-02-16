package com.example.InstagramClone.Service;

import com.example.InstagramClone.Model.ApiKeyAuthenticationToken;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AuthenticationService {
    private final AuthenticationAPIService authenticationAPIService;

    public AuthenticationService(AuthenticationAPIService authenticationAPIService){
        this.authenticationAPIService = authenticationAPIService;
    }

    public String signup(HttpServletRequest request) {
        try {
            ApiKeyAuthenticationToken token = authenticationAPIService.getAuthentication(request);

            if (token.isAuthenticated()) {
                return "123"; // Success response
            }
        } catch (BadCredentialsException e) {
            return "Invalid API Key";
        }

        return "Authentication fail";
    }
}
