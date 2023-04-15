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
@Table(name="tecnologias")
public class Tecnologias {
    @Id
    @Column(name="id_tecnologias")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_tecnologia;
      
    @Column(name = "nombre_tecnologia", length = 45, nullable = false)
    private String nombre_tecnologia;
    @Column(name = "porcentaje_tecnologia", length = 45, nullable = false)
    private String porcentaje_tecnologia;

    public Tecnologias() {
    }
    public Tecnologias(long id_tecnologia, String nombre_tecnologia, String porcentaje_tecnologia) {
        this.id_tecnologia = id_tecnologia;
        this.nombre_tecnologia = nombre_tecnologia;
        this.porcentaje_tecnologia = porcentaje_tecnologia;
    }     
}
