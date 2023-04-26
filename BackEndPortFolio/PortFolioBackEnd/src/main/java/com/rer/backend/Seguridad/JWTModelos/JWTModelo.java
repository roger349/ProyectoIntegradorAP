package com.rer.backend.Seguridad.JWTModelos;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class JWTModelo {
    private String token;
    private String bearer = "Bearer";
    private String nombre_usuario;
    private Collection<? extends GrantedAuthority> authorities;


    public JWTModelo(String token, String nombre_usuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombre_usuario = nombre_usuario;
        this.authorities = authorities;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
    
}
