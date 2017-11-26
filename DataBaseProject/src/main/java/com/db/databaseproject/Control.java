package com.db.databaseproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Control {
    CharacterInfo characterInfo = new CharacterInfo();

    @RequestMapping(method = RequestMethod.GET, value = "User.Json")
    public void Name(@RequestParam("name") String FirstName) {
        characterInfo.setName(FirstName);
    }
}
