package com.example.PARCIAL2.Controller;

import com.example.PARCIAL2.Model.Partido;
import com.example.PARCIAL2.Services.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partidos")
public class PartidoController {
    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> findAll() {
        return partidoService.findAll();
    }

    @PostMapping
    public Partido save(@RequestBody Partido partido) {
        return partidoService.save(partido);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        partidoService.deleteById(id);
    }
}
