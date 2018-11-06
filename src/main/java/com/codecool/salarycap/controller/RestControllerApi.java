package com.codecool.salarycap.controller;

import com.codecool.salarycap.model.Player;
import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.model.TeamDTO;
import com.codecool.salarycap.respository.TeamRepository;
import com.codecool.salarycap.service.PlayerService;
import com.codecool.salarycap.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerApi {

    private TeamService teamService;
    private PlayerService playerService;

    public RestControllerApi(TeamService teamService, PlayerService playerService) {
        this.teamService = teamService;
        this.playerService = playerService;
    }

    @CrossOrigin
    @GetMapping("/teams")
    public ResponseEntity<List<TeamDTO>> getAllTeams() {
        return new ResponseEntity(teamService.findMainPageInfo(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/team/{id}")
    public ResponseEntity<List<Player>> getPlayersByeTeam(@PathVariable("id") Team id) {
        return new ResponseEntity(playerService.findByTeam(id), HttpStatus.OK);
    }
}
