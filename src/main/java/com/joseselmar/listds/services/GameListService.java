package com.joseselmar.listds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseselmar.listds.dto.GameListDTO;
import com.joseselmar.listds.entities.GameList;
import com.joseselmar.listds.repository.GameListRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository repository;
    
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        var dto = result
                    .stream()
                    .map(x -> new GameListDTO(x))
                    .toList();
        return dto;
    }

}
