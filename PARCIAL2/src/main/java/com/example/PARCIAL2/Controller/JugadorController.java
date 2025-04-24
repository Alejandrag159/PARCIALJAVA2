package com.example.PARCIAL2.Controller;

import com.example.PARCIAL2.Model.Jugador;
import com.example.PARCIAL2.Services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public List<Jugador> findAll() {
        return jugadorService.findAll();
    }

    @GetMapping("/equipo/{idEquipo}")
    public List<Jugador> findByEquipo(@PathVariable Integer idEquipo) {
        return jugadorService.findByEquipo(idEquipo);
    }

    @GetMapping("/goles")
    public List<Jugador> findByGolesGreaterThan(@RequestParam Integer minGoles) {
        return jugadorService.findByGolesGreaterThan(minGoles);
    }

    @PostMapping
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorService.save(jugador);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        jugadorService.deleteById(id);
    }

}
