package com.example.PARCIAL2.Services;

import com.example.PARCIAL2.Model.Partido;
import com.example.PARCIAL2.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> findAll() {
        return partidoRepository.findAll();
    }


    public Partido save(Partido partido) {
        return partidoRepository.save(partido);
    }

    public void deleteById(Integer id) {
        partidoRepository.deleteById(id);
    }

}
