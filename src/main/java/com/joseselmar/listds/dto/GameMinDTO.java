package com.joseselmar.listds.dto;

import com.joseselmar.listds.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String imgUrl;
    private String shortDescription;
    
    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.genre = entity.getGenre();
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.title = entity.getTitle();
        this.year = entity.getYear();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }



}
