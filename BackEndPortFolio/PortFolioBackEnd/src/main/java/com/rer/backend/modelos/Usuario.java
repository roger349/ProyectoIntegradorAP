package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @Column(name="id_dni")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_dni;
      
    @Column(name = "nombre_usuario",nullable = false)
    private String nombre_usuario;
    @Column(name = "password_usuario",nullable = false)
    private String password_usuario;

    public Usuario() {
    }
    public Usuario(long id_dni, String nombre_usuario, String password_usuario) {
        this.id_dni = id_dni;
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
    }

    public long getId_dni() {
        return id_dni;
    }

    public void setId_dni(long id_dni) {
        this.id_dni = id_dni;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }  
}