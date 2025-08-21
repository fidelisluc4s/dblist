package com.dev.prosolution.dblist.services;

import com.dev.prosolution.dblist.dto.GameMinDTO;
import com.dev.prosolution.dblist.entities.Game;
import com.dev.prosolution.dblist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }
}
