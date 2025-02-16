package com.example.InstagramClone.Service;

import com.example.InstagramClone.Model.ApiKeyAuthenticationToken;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationAPIService {
    private static final String X_API_KEY = "INSTAGRAM_APP";
//    private static final String AUTH_TOKEN = "Baeldung";
    public static ApiKeyAuthenticationToken getAuthentication(HttpServletRequest request){
        String api_key = request.getHeader("X_API_KEY");
        System.out.println("API Key: " + api_key);
        if (api_key == null) {
            throw new BadCredentialsException("Invalid API Key");
        }

        return new ApiKeyAuthenticationToken(X_API_KEY, AuthorityUtils.NO_AUTHORITIES);
    }
}