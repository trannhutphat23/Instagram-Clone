package com.example.InstagramClone.Service;

import com.example.InstagramClone.Model.ApiKeyAuthenticationToken;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthenticationAPIService {
    private static final String X_API_KEY = "INSTAGRAM_APP";
    public static ApiKeyAuthenticationToken getAuthentication(HttpServletRequest request){
        String api_key = request.getHeader("X_API_KEY");
        if (!Objects.equals(api_key, X_API_KEY)) {
            throw new BadCredentialsException("Invalid API Key");
        }

        return new ApiKeyAuthenticationToken(X_API_KEY, AuthorityUtils.NO_AUTHORITIES);
    }
}