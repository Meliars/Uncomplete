package com.rivalgame.characters;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Characters implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long idEmployer;
    private String role = "USER";
    @NotEmpty
    private String login;
    @NotEmpty
    private String password;
    @NotEmpty
    private static String rePassword;
    @NotEmpty
    private String nameEmployer;
    @NotEmpty
    private String surnameEmployer;
    @NotEmpty
    private String projectEmployer;
    @NotEmpty
    private String groupEmployer;
    private int scoreInGame = 2;


    public Characters(String role, String login, String password, String rePassword, String nameEmployer, String surnameEmployer, String projectEmployer, String groupEmployer, int scoreInGame) {
        this.role = role;
        this.login = login;
        this.password = password;
        this.rePassword = rePassword;
        this.nameEmployer = nameEmployer;
        this.surnameEmployer = surnameEmployer;
        this.projectEmployer = projectEmployer;
        this.groupEmployer = groupEmployer;
        this.scoreInGame = scoreInGame;
    }

    public Characters() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(Long idEmployer) {
        this.idEmployer = idEmployer;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getNameEmployer() {
        return nameEmployer;
    }

    public void setNameEmployer(String nameEmployer) {
        this.nameEmployer = nameEmployer;
    }

    public String getSurnameEmployer() {
        return surnameEmployer;
    }

    public void setSurnameEmployer(String surnameEmployer) {
        this.surnameEmployer = surnameEmployer;
    }

    public String getProjectEmployer() {
        return projectEmployer;
    }

    public void setProjectEmployer(String projectEmployer) {
        this.projectEmployer = projectEmployer;
    }

    public String getGroupEmployer() {
        return groupEmployer;
    }

    public void setGroupEmployer(String groupEmployer) {
        this.groupEmployer = groupEmployer;
    }

    public int getScoreInGame() {
        return scoreInGame;
    }

    public void setScoreInGame(int scoreInGame) {
        this.scoreInGame = scoreInGame;
    }


}


