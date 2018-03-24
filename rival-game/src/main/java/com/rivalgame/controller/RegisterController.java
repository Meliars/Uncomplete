package com.rivalgame.controller;

import com.rivalgame.characters.Characters;
import com.rivalgame.database.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")
public class RegisterController {

    private DBConnector dbConnector;

    @Autowired
    public void RegisterController(DBConnector dbConnector){
        this.dbConnector=dbConnector;
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveChar(@RequestBody Characters characters) throws Exception {
            dbConnector.setUp();
            dbConnector.save(characters);
            return "register";

    }

}
