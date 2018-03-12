package com.rivalgame.controller;

import com.rivalgame.characters.Characters;
import com.rivalgame.database.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private DBConnector dbConnector;

    @Autowired
    public void registerController (DBConnector dbConnector){
        this.dbConnector=dbConnector;
    }

    @PostMapping
    public String addUser(@ModelAttribute Characters characters, RedirectAttributes redirectAttributes) throws Exception {
        dbConnector.setUp();
        dbConnector.save(characters);
        redirectAttributes.addFlashAttribute("message", "User added successfuly");
        return "redirect:/";
    }

}
