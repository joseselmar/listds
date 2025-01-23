package com.joseselmar.listds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseselmar.listds.dto.GameListDTO;
import com.joseselmar.listds.dto.GameMinDTO;
import com.joseselmar.listds.services.GameListService;
import com.joseselmar.listds.services.GameService;


@RestController
@RequestMapping(value="/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
       var result = gameListService.findAll();
       return result;
    }

    @GetMapping(value="/{id}/games")
    public List<GameMinDTO> findByList(@PathVariable Long id){
        var dto = gameService.findByList(id);
        return dto;
    }
}
