package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proyectos")
public class Proyectos {
    @Id
    @Column(name="id_proyecto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_proyecto;
      
    @Column(name = "nombre_proyecto", length = 45, nullable = false)
    private String nombre_proyecto;
    @Column(name = "descripcion_proyecto", length = 200, nullable = false)
    private String descripcion_proyecto;

    public Proyectos() {
    }
    public Proyectos(long id_proyecto, String nombre_proyecto, String descripcion_proyecto) {
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
    }

    public long getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }
    
}
