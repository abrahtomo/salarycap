package com.codecool.salarycap.service;

import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.model.TeamDTO;
import com.codecool.salarycap.respository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> findAll() {return teamRepository.findAll();}

    public List<TeamDTO> findMainPageInfo() {return teamRepository.findMainPageInfo();}

    public void saveTeam(Team entity) {teamRepository.save(entity);}
}
