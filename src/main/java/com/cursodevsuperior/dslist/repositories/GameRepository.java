package com.cursodevsuperior.dslist.repositories;

import com.cursodevsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Componente camada de acesso à dados
public interface GameRepository extends JpaRepository<Game, Long> {

}
