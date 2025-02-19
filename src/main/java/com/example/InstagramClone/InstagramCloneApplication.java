package com.example.InstagramClone;

import com.example.InstagramClone.Config.Security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
@PropertySource({
	"classpath:security.properties"
})
public class InstagramCloneApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(InstagramCloneApplication.class, args);

		SecurityConfig securityConfig = context.getBean(SecurityConfig.class);
	}

}