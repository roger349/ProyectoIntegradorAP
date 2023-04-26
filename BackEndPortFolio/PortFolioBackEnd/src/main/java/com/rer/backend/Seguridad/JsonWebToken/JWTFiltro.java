package com.rer.backend.Seguridad.JsonWebToken;

import com.rer.backend.Seguridad.Servicio.UsuarioDetailsImplements;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

public class JWTFiltro extends OncePerRequestFilter {
    
     private final static Logger loger = LoggerFactory.getLogger(JWTProveedor.class);

    @Autowired
    JWTProveedor JWTProv;
    @Autowired
    UsuarioDetailsImplements UserDSI;

    @Override
    protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response, 
                                    FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = getToken(request);
            if (token != null && JWTProv.validateToken(token)) {
                String nombre_usuario = JWTProv.getNombre_usuarioFromToken(token);
                UserDetails userDe = UserDSI.loadUserByUsername(nombre_usuario);
                UsernamePasswordAuthenticationToken authe = new UsernamePasswordAuthenticationToken(userDe,
                        null, userDe.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authe);
            }
        } catch (Exception e) {
            loger.error("Fallo doFilterInternal");
        }
        filterChain.doFilter(request, response);
    }   
    private String getToken(HttpServletRequest req){
        String header = req.getHeader("Authorization");
        if(header != null && header.startsWith("Bearer"))
            return header.replace("Bearer", "");
        return null;
    }    
}

