package com.dev.prosolution.dblist.controllers;

import com.dev.prosolution.dblist.dto.GameMinDTO;
import com.dev.prosolution.dblist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAl(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
