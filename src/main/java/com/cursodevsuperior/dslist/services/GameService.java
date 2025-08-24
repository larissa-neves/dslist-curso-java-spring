package com.cursodevsuperior.dslist.services;


import com.cursodevsuperior.dslist.dto.GameDTO;
import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.entities.Game;
import com.cursodevsuperior.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    //Injeta instância GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;

    //Busca o game no BD e converte para DTO
    @Transactional(readOnly = true) //garantir que as op com o BD aconteça obedencendo os principios das transações
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
