package com.example.fiona1.athletecompetition;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Gymnast extends Athlete {
    private int difficultyPoints;
    private int executionPoints;

    public Gymnast(String name, RunApp runLog, int difficultyPoints, int executionPoints) {
        super(name, runLog);
        this.difficultyPoints = difficultyPoints;
        this.executionPoints = executionPoints;
    }

    @Override
    public int calculatePoints() {
        return difficultyPoints + executionPoints;
    }


}
