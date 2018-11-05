package com.codecool.salarycap.respository;

import com.codecool.salarycap.model.Player;
import com.codecool.salarycap.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query("SELECT p from Player p where p.team = :team")
    List<Player> findByTeamId(@Param("team") Team teamId);
}
