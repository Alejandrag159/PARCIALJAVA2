package com.example.PARCIAL2.Repository;

import com.example.PARCIAL2.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

    @Query(value = "SELECT SUM(goles_lx|ocal) FROM partido WHERE equipo_local = :idEquipo", nativeQuery = true)
    Integer totalGolesEquipoLocal(@Param("idEquipo") Integer idEquipo);

    @Query(value = "SELECT SUM(goles_visita) FROM partido WHERE equipo_visita = :idEquipo", nativeQuery = true)
    Integer totalGolesEquipoVisitante(@Param("idEquipo") Integer idEquipo);
}

