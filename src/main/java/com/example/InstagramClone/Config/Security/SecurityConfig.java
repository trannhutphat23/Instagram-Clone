package com.example.InstagramClone.Config.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({
    "classpath:security.properties"
})
public class SecurityConfig {
    private final Environment environment;
    @Autowired
    public SecurityConfig(Environment environment) {
        this.environment = environment;
    }
    public String getXApiKey() {
        return environment.getProperty("x.api.key");
    }
}
