package com.autenticacao.appautentic.Security.Authentic;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.autenticacao.appautentic.Model.UsuarioModel;
import com.autenticacao.appautentic.Repository.UsuarioRepository;
import com.autenticacao.appautentic.Security.Config.SecurityConfig;
import com.autenticacao.appautentic.Security.Details.UsuarioDetailsImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class UsuarioAutenticFiltro extends OncePerRequestFilter{

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        if (checkIfEndpointsIsNotPublic(request)) {
                String token = RecoveryToken(request);
                if (token != null) {
                    String objeto = jwtTokenService.getSubjectFromToken(token);
                    UsuarioModel usuario = usuarioRepository.findByEmail(objeto).get();
                    UsuarioDetailsImpl usuarioDetailsImpl = new UsuarioDetailsImpl(usuario);


                    //objote de autenticaçao do spring;
                    Authentication authentic = new UsernamePasswordAuthenticationToken(usuarioDetailsImpl.getUsername(),null, usuarioDetailsImpl.getAuthorities());


                    SecurityContextHolder.getContext().setAuthentication(authentic);

                    }else{
                        throw new RuntimeException("Faltando Token!");
                }
        }

        filterChain.doFilter(request, response);

    }


    private String RecoveryToken(HttpServletRequest request) {
        String autoriza = request.getHeader("Autorization");

        if (autoriza != null) {
            return autoriza.replace("Bearer", "");
        }

        return null;
    }


    private boolean checkIfEndpointsIsNotPublic(HttpServletRequest request) {
        String uri = request.getRequestURI();
        return !Arrays.asList(SecurityConfig.ENDPOINTS_AUTHENTICATION_NOT_REQUIRED).contains(uri);
        
    }

    

    

}
