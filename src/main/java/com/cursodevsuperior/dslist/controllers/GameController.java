package com.cursodevsuperior.dslist.controllers;

import com.cursodevsuperior.dslist.dto.GameDTO;
import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.entities.Game;
import com.cursodevsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//porta de entrada backend - disponibiliza/implementa API
@RestController
@RequestMapping(value = "/games") //mapeia recurso - configura o caminho respondido na api
public class GameController {

    //Injetar GameService no GameController
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}") //mapeando método http
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping //mapeando método http
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
