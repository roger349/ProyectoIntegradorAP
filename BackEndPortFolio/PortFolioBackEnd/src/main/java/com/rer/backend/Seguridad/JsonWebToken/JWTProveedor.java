package com.rer.backend.Seguridad.JsonWebToken;

import com.rer.backend.Seguridad.Entidad.UserAdm;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JWTProveedor {
    
    private final static Logger loger = LoggerFactory.getLogger(JWTProveedor.class);
    
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;
    
    public String generateToken(Authentication authe){
        UserAdm userAdm = (UserAdm) authe.getPrincipal();
        return Jwts.builder().setSubject(userAdm.getUsername()).setIssuedAt(new Date()).setExpiration(new Date(new Date()
                .getTime()+expiration*1000)).signWith(SignatureAlgorithm.HS512, secret).compact();
    }
    
    public String getNombre_usuarioFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
    
    public boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        }catch (MalformedJwtException e){
            loger.error("Token mal formado");
        }catch (UnsupportedJwtException e){
            loger.error("Token no soportado");
        }catch (ExpiredJwtException e){
            loger.error("Token expirado");
        }catch (IllegalArgumentException e){
            loger.error("Token vacio");
        }catch (SignatureException e){
            loger.error("Firma no válida");
        }
        return false;
    }
}


