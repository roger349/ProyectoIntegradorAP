package com.rer.backend.Seguridad.Entidad;

import com.rer.backend.Seguridad.TiposDeUsuarios.TipoUsuario;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class EntidadTipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipoUser;
    @NotNull
    @Enumerated(EnumType.STRING)    
    private TipoUsuario nombre_tipoUser;

    public EntidadTipoUsuario() {
    }

    public EntidadTipoUsuario(TipoUsuario nombre_tipoUser) {
        this.nombre_tipoUser = nombre_tipoUser;
    }

    public int getId_tipoUser() {
        return id_tipoUser;
    }

    public void setId_tipoUser(int id_tipoUser) {
        this.id_tipoUser = id_tipoUser;
    }

    public TipoUsuario getNombre_tipoUser() {
        return nombre_tipoUser;
    }

    public void setNombre_tipoUser(TipoUsuario nombre_tipoUser) {
        this.nombre_tipoUser = nombre_tipoUser;
    }
    
    
}
