package com.joseselmar.listds.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //encapsula 2 atribuitos em 1 para BD Relacional
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name="list_id")
    private GameList listGame;

    public BelongingPK(){

    }

    public BelongingPK(Game game, GameList listGame) {
        this.game = game;
        this.listGame = listGame;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    public GameList getListGame() {
        return listGame;
    }

    public void setListGame(GameList listGame) {
        this.listGame = listGame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.game);
        hash = 97 * hash + Objects.hashCode(this.listGame);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BelongingPK other = (BelongingPK) obj;
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return Objects.equals(this.listGame, other.listGame);
    }
    
    
    

}
