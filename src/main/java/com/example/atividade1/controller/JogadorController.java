package com.example.atividade1.controller;

import com.example.atividade1.Model.Jogador;
import com.example.atividade1.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addJogador(@RequestBody Jogador jogador) {
        jogadorRepository.save(jogador);
        return ResponseEntity.ok("Jogador cadastrado para o draft!");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Jogador>> listJogador() {
        List<Jogador> jogadores = jogadorRepository.findAll();
        return ResponseEntity.ok(jogadores);
    }
}

