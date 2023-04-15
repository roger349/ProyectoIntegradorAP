package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @Column(name="id_dni")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_dni;
      
    @Column(name = "nombre_usuario", length = 45, nullable = false)
    private String nombre_usuario;
    @Column(name = "password_usuario", length = 45, nullable = false)
    private String password_usuario;

    public Usuario() {
    }
    public Usuario(long id_dni, String nombre_usuario, String password_usuario) {
        this.id_dni = id_dni;
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
    }
}