package com.example.PARCIAL2.Services;

import com.example.PARCIAL2.Model.Jugador;
import com.example.PARCIAL2.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    public List<Jugador> findByEquipo(Integer idEquipo) {
        return jugadorRepository.findByEquipo(idEquipo);
    }

    public List<Jugador> findByGolesGreaterThan(Integer minGoles) {
        return jugadorRepository.findByGolesGreaterThan(minGoles);
    }

    public Jugador save(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public void deleteById(Integer id) {
        jugadorRepository.deleteById(id);
    }
}
