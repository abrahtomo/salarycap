package com.codecool.salarycap.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "birthplace")
    private String birthplace;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(name = "position")
    private String position;

    @Column(name = "caphit")
    private double caphit;

    public Player() {
    }

    public Player(String name, Date birthday, String birthplace, String position, double caphit) {
        this.name = name;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.position = position;
        this.caphit = caphit;
    }

    public long getPlayerId() {
        return id;
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

    public Team getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public double getCaphit() {
        return caphit;
    }

    public void setPlayerId(long playerId) {
        this.id = playerId;
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

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCaphit(double caphit) {
        this.caphit = caphit;
    }
}
