package com.example.PARCIAL2.Controller;

import com.example.PARCIAL2.Model.Equipo;
import com.example.PARCIAL2.Services.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> findAll() {
        return equipoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Equipo> findById(@PathVariable Integer id) {
        return equipoService.findById(id);
    }

    @PostMapping
    public Equipo save(@RequestBody Equipo equipo) {
        return equipoService.save(equipo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        equipoService.deleteById(id);
    }

    @GetMapping("/{id}/total-goles")
    public Integer getTotalGoles(@PathVariable Integer id) {
        return equipoService.getTotalGoles(id);
    }
}
