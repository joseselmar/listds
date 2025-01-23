package com.joseselmar.listds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joseselmar.listds.dto.GameDTO;
import com.joseselmar.listds.dto.GameMinDTO;
import com.joseselmar.listds.entities.Game;
import com.joseselmar.listds.projection.GameMinProjection;
import com.joseselmar.listds.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly=true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly=true)
    public GameDTO findbyid(Long id){
        Game result = gameRepository.findById(id).get();
        var dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
