package com.joseselmar.listds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseselmar.listds.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>{

}
