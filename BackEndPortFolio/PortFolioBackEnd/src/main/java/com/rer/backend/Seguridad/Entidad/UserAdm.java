package com.rer.backend.Seguridad.Entidad;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserAdm implements UserDetails {
    private String nombre_usuario;
    private String password_usuario;
    private Collection<? extends GrantedAuthority> authorities;

    public UserAdm(String nombre_usuario, String password_usuario, Collection<? extends GrantedAuthority> authorities) {
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
        this.authorities = authorities;
    }

    public static UserAdm build(Usuario usuario) {
        List<GrantedAuthority> authorities = usuario.getClaseUsuario().stream()
           .map(EntidadTipoUsuario -> new SimpleGrantedAuthority(EntidadTipoUsuario.getNombre_tipoUser().name()))
                .collect(Collectors.toList());
        
        return new UserAdm(usuario.getNombre_usuario(), usuario.getPassword_usuario(), authorities);
    } 

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return authorities;
    }
    @Override
    public String getPassword() {
       return password_usuario;
    }

    @Override
    public String getUsername() {
       return nombre_usuario; 
    }

    @Override
    public boolean isAccountNonExpired() {
       return true;
    }

    @Override
    public boolean isAccountNonLocked() {
       return true; 
    }

    @Override
    public boolean isCredentialsNonExpired() {
       return true; 
    }

    @Override
    public boolean isEnabled() {
       return true; 
    }
}
