package com.example.atividade1.repository;

import com.example.atividade1.Model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
