package com.example.datab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@RestController
@Controller
@Entity(name = "transcom")
@Table(name = "employees")
public class CharacterInfo {


    private int id ;
    private String Name;
    private String Surname;
    private String Project;
    private String Group;
    private int Score;

    public CharacterInfo() {}



    public void setName(@RequestParam("name") String Name) {
        this.Name = Name;
    }


    public void setSurname(@RequestParam("surname")String Surname) {
        this.Surname = Surname;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setProject(@RequestParam("project")String Project) {
        this.Project = Project;
    }


    public void setGroup(@RequestParam("group")String Group) {
        this.Group = Group; }


    public void setScore(@RequestParam("score")int Score) {
        this.Score = Score;
    }


    @Column(name = "employeer_Name")
    public String getName() {
        return Name;
    }


    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_employeer")
    public int getId() { return id; }

    @Column(name = "employeer_Surname")
    public String getSurname() { return Surname; }

    @Column(name = "employeer_Project")
    public String getProject() {
        return Project;
    }

    @Column(name = "employeer_Group")
    public String getGroup() {
        return Group;
    }

    @Column(name = "employeer_Score")
    public int getScore() {
        return Score;
    }
}
