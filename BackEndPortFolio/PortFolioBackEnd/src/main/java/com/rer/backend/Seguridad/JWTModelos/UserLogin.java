package com.rer.backend.Seguridad.JWTModelos;

import jakarta.validation.constraints.NotBlank;

public class UserLogin {
    @NotBlank
    private String nombre_usuario;
    @NotBlank
    private String password_usuario;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombreUsuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }    
}
