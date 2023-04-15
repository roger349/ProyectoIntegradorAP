package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="educacion")
public class Educacion {
     @Id
     @Column(name = "id_educacion")
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id_educacion;
     
     
     @Column(name = "titulo", length = 45, nullable = false)
     private String titulo;
     @Column(name = "condicion", length = 45, nullable = false)
     private String condicion;
     @Column(name = "institucion", length = 45, nullable = false)
     private String institucion;

    public Educacion() {
    }
    public Educacion(long id_educacion, String titulo, String condicion, String institucion) {
        this.id_educacion = id_educacion;
        this.titulo = titulo;
        this.condicion = condicion;
        this.institucion = institucion;
    }   
}
