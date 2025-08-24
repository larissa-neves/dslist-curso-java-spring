package com.cursodevsuperior.dslist.services;


import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.entities.Game;
import com.cursodevsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    //Injeta instância GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
