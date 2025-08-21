package com.cursodevsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

//configura a classe java para que seja equivalente a uma tabela do banco relacional
@Entity
@Table(name = "tb_game")
public class Game {

    @Id //configura o id como sendo primary key do bd
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para que o ID seja auto incrementado pelo banco de dados
    private Long id;
    private String title;

    @Column(name = "game_year") //altera nome do campo year no bd para evitar conflito
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    //constructor sem argumentos
    public Game(){

    }

    //constructor com argumentos (possibilidade de instanciar já passando argumentos)

    public Game(Long id, String title, String genre, Integer year, String platform, String imgUrl, String shortDescription, String longDescription) {
        this.id = id; //"o id/dado do objeto recebe o id do argumento"
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    //métodos equals e hashCode para comparar dois games/objetos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
