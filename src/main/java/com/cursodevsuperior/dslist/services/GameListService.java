package com.cursodevsuperior.dslist.services;


import com.cursodevsuperior.dslist.dto.GameDTO;
import com.cursodevsuperior.dslist.dto.GameListDTO;
import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.entities.Game;
import com.cursodevsuperior.dslist.entities.GameList;
import com.cursodevsuperior.dslist.repositories.GameListRepository;
import com.cursodevsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    //Injeta instância GameRepository no GameService
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
