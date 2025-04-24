package com.example.PARCIAL2.Services;

import com.example.PARCIAL2.Model.Equipo;
import com.example.PARCIAL2.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    public Optional<Equipo> findById(Integer id) {
        return equipoRepository.findById(id);
    }

    public Equipo save(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public void deleteById(Integer id) {
        equipoRepository.deleteById(id);
    }

    public Integer getTotalGoles(Integer idEquipo) {
        Integer golesLocal = equipoRepository.totalGolesEquipoLocal(idEquipo);
        Integer golesVisita = equipoRepository.totalGolesEquipoVisitante(idEquipo);
        return (golesLocal != null ? golesLocal : 0) + (golesVisita != null ? golesVisita : 0);
    }
}
