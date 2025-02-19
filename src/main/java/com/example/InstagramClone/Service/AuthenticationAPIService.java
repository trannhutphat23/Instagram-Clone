package com.example.InstagramClone.Service;

import com.example.InstagramClone.Config.Security.SecurityConfig;
import com.example.InstagramClone.Model.ApiKeyAuthenticationToken;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthenticationAPIService {
    private final SecurityConfig securityConfig;
    @Autowired
    public AuthenticationAPIService(SecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }
    public ApiKeyAuthenticationToken getAuthentication(HttpServletRequest request){
        String apiKey = request.getHeader("X_API_KEY");
        String X_API_KEY = securityConfig.getXApiKey();

        if (!Objects.equals(apiKey != null ? apiKey.trim() : null, X_API_KEY.trim().replace("\"", ""))) {
            throw new BadCredentialsException("Invalid API Key");
        }

        return new ApiKeyAuthenticationToken(X_API_KEY, AuthorityUtils.NO_AUTHORITIES);
    }
}