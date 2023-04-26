package com.rer.backend.Seguridad.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @Column(name="id_User")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_User;
    @NotNull  
    @Column(unique=true ,name = "nombre_usuario")
    private String nombre_usuario;
    @NotNull
    @Column( name = "password_usuario")
    private String password_usuario;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name= "Clases_de_Usuarios", joinColumns = @JoinColumn(name= "id_usuario"),
               inverseJoinColumns = @JoinColumn(name= "id_tipoUsuario" )) 
   private Set<EntidadTipoUsuario> claseUsuario  = new HashSet<>();

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String password_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
    }

    public long getId_User() {
        return id_User;
    }

    public void setId_User(long id_User) {
        this.id_User = id_User;
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

    public Set<EntidadTipoUsuario> getClaseUsuario() {
        return claseUsuario;
    }

    public void setClaseUsuario(Set<EntidadTipoUsuario> claseUsuario) {
        this.claseUsuario = claseUsuario;
    }
    
    
}