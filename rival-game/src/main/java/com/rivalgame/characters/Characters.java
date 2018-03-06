package com.rivalgame.characters;

import org.springframework.stereotype.Component;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Component
public class Characters implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    private Long idEmployer;
    private String nameEmployer;
    private String surnameEmployer;
    private String projectEmployer;
    private String groupEmployer;
    private int scoreInGame = 2;

    public Characters() {

    }


    public Characters(Long idEmployer, String nameEmployer, String surnameEmployer, String projectEmployer, String groupEmployer, int score) {
        super();
        this.idEmployer = idEmployer;
        this.nameEmployer = nameEmployer;
        this.surnameEmployer = surnameEmployer;
        this.projectEmployer = projectEmployer;
        this.groupEmployer = groupEmployer;
        this.scoreInGame = score;
    }

    public Long getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(Long id) {
       this.idEmployer = id;
    }

    public String getNameEmployer() {
        return nameEmployer;
    }

    public void setNameEmployer(String name) {
        this.nameEmployer = name;
    }

    public String getSurnameEmployer() {
        return surnameEmployer;
    }

    public void setSurnameEmployer(String surname) {
        this.surnameEmployer = surname;
    }

    public String getProjectEmployer() {
        return projectEmployer;
    }

    public void setProjectEmployer(String project) {
        this.projectEmployer = project;
    }

    public String getGroupEmployer() {
        return groupEmployer;
    }

    public void setGroupEmployer(String group) {
        this.groupEmployer = group;
    }

    public int getScoreInGame() {
        return scoreInGame;
    }

    public void setScoreInGame(int score) {
        this.scoreInGame = score;
    }
}
