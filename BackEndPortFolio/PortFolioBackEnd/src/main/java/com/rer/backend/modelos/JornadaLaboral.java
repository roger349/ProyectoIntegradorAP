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
@Table(name="jornada_laboral")
public class JornadaLaboral {
    @Id
    @Column(name="id_jornada")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_jornada;
      
    @Column(name = "tipo_jornada", length = 45, nullable = false)
    private String tipo_jornada;

    public JornadaLaboral() {
    }
    public JornadaLaboral(long id_jornada, String tipo_jornada) {
        this.id_jornada = id_jornada;
        this.tipo_jornada = tipo_jornada;
    }
}
