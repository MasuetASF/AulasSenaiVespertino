package com.autenticacao.appautentic.Security.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.autenticacao.appautentic.Security.Authentic.UsuarioAutenticFiltro;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UsuarioAutenticFiltro usuarioAutenticFiltro;

    public static final String [] ENDPOINTS_AUTHENTICATION_NOT_REQUIRED =
        {
            "/usuario/login",
            "/usuario/create"
        };

    public static final String [] ENDPOINTS_AUTHENTICATION_REQUIRED =    {
            "/usuario/teste"
        };

        public static final String [] ENDPOINTS_CLIENTE =    {
            "/usuario/teste/cliente"
        };
        public static final String [] ENDPOINTS_ADMIN =    {
            "/usuario/teste/admin"
        };
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(autorize -> autorize.requestMatchers(ENDPOINTS_AUTHENTICATION_NOT_REQUIRED).permitAll())
                .authorizeHttpRequests(autorize -> autorize.requestMatchers(ENDPOINTS_AUTHENTICATION_REQUIRED).permitAll().anyRequest().authenticated())
                .authorizeHttpRequests(autorize -> autorize.requestMatchers(ENDPOINTS_CLIENTE).hasAnyRole("Admin"))
                .authorizeHttpRequests(autorize -> autorize.requestMatchers(ENDPOINTS_ADMIN).hasAnyRole("Cliente"))
                .addFilterBefore(usuarioAutenticFiltro, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager (AuthenticationConfiguration authenticationConfiguration) throws  Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}