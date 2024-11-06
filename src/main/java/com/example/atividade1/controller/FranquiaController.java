package com.example.atividade1.controller;

import com.example.atividade1.Model.Franquia;
import com.example.atividade1.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/franquias")
public class FranquiaController {

    @Autowired
    private FranquiaRepository franquiaRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addFranquia(@RequestBody Franquia franquia) {
        franquiaRepository.save(franquia);
        return ResponseEntity.ok("Franquia cadastrada!");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Franquia>> listFranquias() {
        List<Franquia> franquias = franquiaRepository.findAll();
        return ResponseEntity.ok(franquias);
    }
}
