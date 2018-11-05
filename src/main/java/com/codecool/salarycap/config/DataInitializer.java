package com.codecool.salarycap.config;

import com.codecool.salarycap.model.Player;
import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.service.PlayerService;
import com.codecool.salarycap.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Configuration
public class DataInitializer {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    @Bean
    public CommandLineRunner init() {
        return strings -> {
            saveData();
        };
    }

    private void saveData() {
        Player getzlaf = new Player(
                "Ryan Getzlaf",
                new GregorianCalendar(1985, Calendar.MAY, 10).getTime(),
                "Regina",
                "Center",
                8250000);

        Player gibson = new Player(
                "John Gibson",
                new GregorianCalendar(1993, Calendar.JULY, 14).getTime(),
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
