package com.codecool.salarycap.Model;


import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "birthplace")
    private String birthplace;

    @ManyToOne
    @JoinColumn(name = "teamid")
    private Team teamid;

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

    public long getId() {
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

    public Team getTeamid() {
        return teamid;
    }

    public String getPosition() {
        return position;
    }

    public Currency getCaphit() {
        return caphit;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setTeamid(Team teamid) {
        this.teamid = teamid;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCaphit(Currency caphit) {
        this.caphit = caphit;
    }
}
