package com.codecool.salarycap;

import com.codecool.salarycap.model.Player;
import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.service.PlayerService;
import com.codecool.salarycap.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;


@SpringBootApplication
public class SalaryCapApplication implements CommandLineRunner {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    public static void main(String[] args) {
        SpringApplication.run(SalaryCapApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... arg0){
        saveData();
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
