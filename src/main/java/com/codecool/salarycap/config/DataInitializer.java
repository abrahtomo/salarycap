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

        //Init Anaheim Players

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

        //Init Arizona Players

        Player keller = new Player(
                "Clayton Keller",
                new GregorianCalendar(1998, Calendar.JULY, 29).getTime(),
                "Swansea",
                "Center, Left Wing",
                885833
        );

        //Init Boston Players

        Player krejci = new Player(
                "David Krejci",
                new GregorianCalendar(1976, Calendar.APRIL, 28).getTime(),
                "Sternberk",
                "Center",
                7250000
        );

        //Init Buffalo Players
        Player eichel = new Player(
                "Jack Eichel",
                new GregorianCalendar(1996, Calendar.OCTOBER, 28).getTime(),
                "Chelmsford",
                "Center",
                10000000
        );

        //Init Calgary Players
        Player giordano = new Player(
                "Mark Giordano",
                new GregorianCalendar(1983, Calendar.OCTOBER, 3).getTime(),
                "Toronto",
                "Defense",
                6750000
        );

        //Init Carolina Players
        Player jStaal = new Player(
                "Jordan Staal",
                new GregorianCalendar(1988, Calendar.SEPTEMBER, 10).getTime(),
                "Thunder Bay",
                "Center, Left Wing",
                6000000
        );

        //Init Chicago Players
        Player pKane = new Player(
                "Patrick Kane",
                new GregorianCalendar(1988, Calendar.NOVEMBER, 19).getTime(),
                "Buffalo",
                "Right Wing, Center",
                10500000
        );

        Team anaheim = new Team("Anaheim Ducks");
        Team arizona = new Team("Arizona Coyotes");
        Team boston = new Team("Boston Bruins");
        Team buffalo = new Team("Buffalo Sabres");
        Team calgary = new Team("Calgary Flames");
        Team carolina = new Team("Carolina Hurricanes");
        Team chicago = new Team("Chicago Blackhawks");
        Team colorado = new Team("Colorado Avalanche");
        Team columbus = new Team("Columbus Blue Jackets");
        Team dallas = new Team("Dallas Teams");
        Team detroit = new Team("Detroit Red Wings");
        Team edmonton = new Team("Edmonton Oilers");
        Team florida = new Team("Florida Panthers");
        Team losAngeles = new Team("Los Angeles Kings");
        Team minnesota = new Team("Minnesota Wild");
        Team montreal = new Team("Montreal Canadiens");
        Team nashville = new Team("Nashville Predators");
        Team newJersey = new Team("New Jersey Devils");
        Team isles = new Team("New York Islanders");
        Team rangers = new Team("New York Rangers");
        Team ottawa = new Team("Ottawa Senators");
        Team philadephia = new Team("Philadelphia Flyers");
        Team pittsburgh = new Team("Pittsburgh Penguins");
        Team sanJose = new Team("San Jose Sharks");
        Team stLouis = new Team("St. Louis Blues");
        Team tampa = new Team("Tampa Bay Lightning");
        Team toronto = new Team("Toronto Maple Leafs");
        Team vancouver = new Team("Vancouver Canucks");
        Team vegas = new Team("Vegas Golden Knights");
        Team washington = new Team("Washington Capitals");
        Team winnipeg = new Team("Winnipeg Jets");

        getzlaf.setTeam(anaheim);
        gibson.setTeam(anaheim);

        keller.setTeam(arizona);

        krejci.setTeam(boston);

        eichel.setTeam(buffalo);

        giordano.setTeam(calgary);

        jStaal.setTeam(carolina);

        pKane.setTeam(chicago);

        teamService.saveTeam(anaheim);
        teamService.saveTeam(arizona);
        teamService.saveTeam(boston);
        teamService.saveTeam(buffalo);
        teamService.saveTeam(calgary);
        teamService.saveTeam(carolina);
        teamService.saveTeam(chicago);
        teamService.saveTeam(colorado);
        teamService.saveTeam(columbus);
        teamService.saveTeam(dallas);
        teamService.saveTeam(detroit);
        teamService.saveTeam(edmonton);
        teamService.saveTeam(florida);
        teamService.saveTeam(losAngeles);
        teamService.saveTeam(minnesota);
        teamService.saveTeam(montreal);
        teamService.saveTeam(nashville);
        teamService.saveTeam(newJersey);
        teamService.saveTeam(isles);
        teamService.saveTeam(rangers);
        teamService.saveTeam(ottawa);
        teamService.saveTeam(philadephia);
        teamService.saveTeam(pittsburgh);
        teamService.saveTeam(sanJose);
        teamService.saveTeam(stLouis);
        teamService.saveTeam(tampa);
        teamService.saveTeam(toronto);
        teamService.saveTeam(vancouver);
        teamService.saveTeam(vegas);
        teamService.saveTeam(washington);
        teamService.saveTeam(winnipeg);

        playerService.savePlayer(getzlaf);
        playerService.savePlayer(gibson);

        playerService.savePlayer(keller);

        playerService.savePlayer(krejci);

        playerService.savePlayer(eichel);

        playerService.savePlayer(giordano);

        playerService.savePlayer(jStaal);

        playerService.savePlayer(pKane);
    }
}
