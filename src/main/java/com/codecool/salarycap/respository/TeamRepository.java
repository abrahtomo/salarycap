package com.codecool.salarycap.respository;

import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.model.TeamDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findByTeamName(String teamName);

//    @Query("SELECT teams.team_name, count(player.name) as rosterSize, sum(player.caphit) as " +
//            "totalCaphit from teams join player on teams.id = player.team_id group by teams.team_name")
    @Query("SELECT new com.codecool.salarycap.model.TeamDTO(t.teamName, count(p), sum(p.caphit)) " +
            "from Team t join t.players p group by t.teamName")
    List<TeamDTO> findMainPageInfo();
}
