package com.codecool.salarycap;

import com.codecool.salarycap.model.Player;
import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.service.PlayerService;
import com.codecool.salarycap.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SalaryCapApplication implements CommandLineRunner {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    public static void main(String[] args) {
        SpringApplication.run(SalaryCapApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception{
        saveData();
    }

    private void saveData() {
        Player getzlaf = new Player(
                "Ryan Getzlaf",
                "Regina",
                "Center",
                8250000);

        Player gibson = new Player(
                "John Gibson",
                "Pittsburgh",
                "Goalie",
                6400000
        );

        Team anaheim = new Team("Anaheim Ducks");

        getzlaf.setTeam(anaheim);
        gibson.setTeam(anaheim);

        teamService.saveTeam(anaheim);
        playerService.savePlayer(getzlaf);
        playerService.savePlayer(gibson);
    }

}
