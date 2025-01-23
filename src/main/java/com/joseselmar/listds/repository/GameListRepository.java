package com.joseselmar.listds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseselmar.listds.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
