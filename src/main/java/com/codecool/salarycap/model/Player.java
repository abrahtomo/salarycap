package com.codecool.salarycap.model;


import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long playerId;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "birthplace")
    private String birthplace;

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team teamId;

    @Column(name = "position")
    private String position;

    @Column(name = "caphit")
    private Currency caphit;

    public Player(String name, Date birthday, String birthplace, String position, Currency caphit) {
        this.name = name;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.position = position;
        this.caphit = caphit;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public Team getTeamId() {
        return teamId;
    }

    public String getPosition() {
        return position;
    }

    public Currency getCaphit() {
        return caphit;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setTeamId(Team teamId) {
        this.teamId = teamId;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCaphit(Currency caphit) {
        this.caphit = caphit;
    }
}
