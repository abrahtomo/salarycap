package com.codecool.salarycap.model;

public class TeamDTO {
    private String name;
    private long count;
    private double sumOfCapHit;

    public TeamDTO() {
    }

    public TeamDTO(String name, long count, double sumOfCapHit) {
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
}