package com.example.PARCIAL2.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "estadisticas_jugador")
public class EstadisticaJugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estadistica")
    private Integer idEstadistica;

    private Integer minutosJugados;
    private Integer goles;
    private Integer asistencias;
    private Integer tarjetasAmarillas;
    private Integer tarjetasRojas;

    @ManyToOne
    @JoinColumn(name = "id_jugador", referencedColumnName = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido", referencedColumnName = "id_partido")
    private Partido partido;

    public EstadisticaJugador() {
    }

    public EstadisticaJugador(Integer idEstadistica, Integer minutosJugados, Integer goles, Integer asistencias, Integer tarjetasAmarillas, Integer tarjetasRojas, Jugador jugador, Partido partido) {
        this.idEstadistica = idEstadistica;
        this.minutosJugados = minutosJugados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.jugador = jugador;
        this.partido = partido;
    }

    public Integer getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(Integer idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public Integer getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(Integer minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(Integer tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public Integer getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(Integer tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
