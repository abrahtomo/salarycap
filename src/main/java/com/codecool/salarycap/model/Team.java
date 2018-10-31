package com.codecool.salarycap.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "teamName")
    private String teamName;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private Set<Player> players;

    public Team() {
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public long getTeamId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setTeamId(long teamId) {
        this.id = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
