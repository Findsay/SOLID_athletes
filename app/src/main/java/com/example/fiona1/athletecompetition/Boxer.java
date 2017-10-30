package com.example.fiona1.athletecompetition;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Boxer extends Athlete {
    private int hitsGiven;
    private int hitsTaken;

    public Boxer(String name, RunApp runLog, int hitsGiven, int hitsTaken) {
        super(name, runLog);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int calculatePoints() {
        return hitsGiven - hitsTaken;
    }


}
