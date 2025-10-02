package com.nexus.backend.rests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // desabilita CSRF (cuidado em produção)
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // permite todos os endpoints sem login
            );
        return http.build();
    }
}
