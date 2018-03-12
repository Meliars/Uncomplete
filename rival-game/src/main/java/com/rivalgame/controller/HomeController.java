package com.rivalgame.controller;

import com.rivalgame.characters.Characters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("characters", new Characters());
        return "register";
    }


}
