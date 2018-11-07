package com.codecool.salarycap.respository;

import com.codecool.salarycap.model.Team;
import com.codecool.salarycap.model.TeamDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT new com.codecool.salarycap.model.TeamDTO(t.id ,t.teamName, count(p), sum(p.caphit)) " +
            "from Team t join t.players p group by t.id, t.teamName order by sum(p.caphit) desc ")
    List<TeamDTO> findMainPageInfo();
}
