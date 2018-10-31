package com.codecool.salarycap.service;

import com.codecool.salarycap.model.Player;
import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.respository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {return playerRepository.findAll();}

    public void savePlayer(Player entity) {playerRepository.save(entity);}

    public List<Player> findByTeam(Team id) {return playerRepository.findByTeamId(id);}
}
