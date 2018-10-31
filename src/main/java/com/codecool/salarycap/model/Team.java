package com.codecool.salarycap.model;

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
    private Set<Player> players;

    public Team(String teamName, Set<Player> players) {
        this.teamName = teamName;
        this.players = players;
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
