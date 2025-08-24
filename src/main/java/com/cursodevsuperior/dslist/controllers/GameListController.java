package com.cursodevsuperior.dslist.controllers;

import com.cursodevsuperior.dslist.dto.GameDTO;
import com.cursodevsuperior.dslist.dto.GameListDTO;
import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.services.GameListService;
import com.cursodevsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//porta de entrada backend - disponibiliza/implementa API
@RestController
@RequestMapping(value = "/lists") //mapeia recurso - configura o caminho respondido na api
public class GameListController {

    //Injetar GameService no GameController
    @Autowired
    private GameListService gameListService;

    @GetMapping //mapeando método http
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
