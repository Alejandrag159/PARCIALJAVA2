package com.example.PARCIAL2.Repository;

import com.example.PARCIAL2.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido, Integer> {

    @Query(value = "SELECT p.*, el.nombre as nombre_local, ev.nombre as nombre_visita " +
            "FROM partido p " + "JOIN equipo el ON p.equipo_local = el.id_equipo " +
            "JOIN equipo ev ON p.equipo_visita = ev.id_equipo", nativeQuery = true)
    List<Object[]> findAllWithTeamNames();
}
