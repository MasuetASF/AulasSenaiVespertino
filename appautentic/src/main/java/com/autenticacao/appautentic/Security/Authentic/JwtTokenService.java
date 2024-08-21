package com.autenticacao.appautentic.Security.Authentic;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import com.autenticacao.appautentic.Security.Details.UsuarioDetailsImpl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Service
public class JwtTokenService{
    private static final String chave_secreta = "ui6098ghçjkv@dlsfdgsfdj@dgçhj%fj%sfd!kkrq724";

    private static final String emissor = "token-api";

    public String generateToken(UsuarioDetailsImpl usuario){
        try {
            Algorithm algoritmo = Algorithm.HMAC256(chave_secreta);
            return JWT.create()
                   .withIssuer(emissor)
                   .withIssuedAt(creationDate())
                   .withExpiresAt(expirationDate())
                   .withSubject(usuario.getUsername())
                   .sign(algoritmo);
        } 
        catch (JWTCreationException e) {
            throw new JWTVerificationException("Token inválido");
        }
    }

    public String getSubjectFromToken(String token){
        try {
            Algorithm algoritmo = Algorithm.HMAC256(chave_secreta);
            return JWT.require(algoritmo)
                   .withIssuer(emissor)
                   .build()
                   .verify(token)
                   .getSignature();     
        } catch (JWTCreationException e) {
            throw new JWTVerificationException("Token inválido ou expirado");
        }
    }

    private Instant creationDate() {
        return ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).toInstant();    
    }

    private Instant expirationDate(){
        return ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).plusHours(4).toInstant();  
    }
}
