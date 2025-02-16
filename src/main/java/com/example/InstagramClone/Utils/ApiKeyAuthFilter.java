package com.example.InstagramClone.Utils;

import com.example.InstagramClone.Model.ApiKeyAuthenticationToken;
import com.example.InstagramClone.Service.AuthenticationAPIService;
import com.example.InstagramClone.Service.AuthenticationService;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ApiKeyAuthFilter extends GenericFilter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        try {
            ApiKeyAuthenticationToken token = AuthenticationAPIService.getAuthentication(httpRequest);

            if (!token.isAuthenticated()) {
                throw new BadCredentialsException("Invalid API Key");
            }

            filterChain.doFilter(servletRequest, servletResponse);
        } catch (BadCredentialsException e) {
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.getWriter().write("Invalid API Key");
        }
    }
}
