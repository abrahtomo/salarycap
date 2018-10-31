package com.codecool.salarycap.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long teamId;

    @Column(name = "teamName")
    private String teamName;

    @OneToMany(mappedBy = "tean")
    private Set<Player> players = new HashSet<>();

    public Team(String teamName, Set<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public long getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
