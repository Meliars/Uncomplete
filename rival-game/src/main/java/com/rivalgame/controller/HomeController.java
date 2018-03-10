package com.rivalgame.controller;

import com.rivalgame.characters.Characters;
import com.rivalgame.database.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    @Autowired
    private Characters characters;
    @Autowired
    private DBConnector dbConnector;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }


    @PostMapping("/register")
    public String characters(@RequestParam String name, @RequestParam String surname, @RequestParam String project, @RequestParam String group, Model model) throws Exception {
        model.addAttribute("characters", characters);
        characters.setNameEmployer(name);
        characters.setSurnameEmployer(surname);
        characters.setGroupEmployer(group);
        characters.setProjectEmployer(project);
        dbConnector.setUp();
        dbConnector.save(characters);
        System.out.println(name + surname + project + group);
        return "register";
    }



}
