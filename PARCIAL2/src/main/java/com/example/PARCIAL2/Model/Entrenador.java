package com.example.PARCIAL2.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "entrenador")
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrenador")
    private Integer idEntrenador;

    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    private Equipo equipo;

}
