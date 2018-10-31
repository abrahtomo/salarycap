package com.codecool.salarycap.respository;

import com.codecool.salarycap.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findByTeamName(String teamName);
}
