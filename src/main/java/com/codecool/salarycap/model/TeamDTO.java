package com.codecool.salarycap.model;

public class TeamDTO {
    private long teamId;
    private String name;
    private long count;
    private double sumOfCapHit;

    public TeamDTO(long teamId, String name, long count, double sumOfCapHit) {
        this.teamId = teamId;
        this.name = name;
        this.count = count;
        this.sumOfCapHit = sumOfCapHit;
    }

    public String getName() {
        return name;
    }

    public long getCount() {
        return count;
    }

    public double getSumOfCapHit() {
        return sumOfCapHit;
    }

    public long getTeamId() {
        return teamId;
    }
}