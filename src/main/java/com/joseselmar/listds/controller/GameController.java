package com.joseselmar.listds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseselmar.listds.entities.Game;
import com.joseselmar.listds.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> findAll(){
       var result = gameService.findAll();
       return result;
    }
}
