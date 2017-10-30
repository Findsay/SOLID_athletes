package com.example.fiona1.athletecompetition;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class Event {

    private String name;
    private int numberOfAthletes;
    private ArrayList<Athlete> athletes;

    public Event(String name, int numberOfAthletes) {
        this.name = name;
        this.numberOfAthletes = numberOfAthletes;
        this.athletes = new ArrayList<>();
    }

    public int getNumberofCompetitors() {
        return athletes.size();
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public boolean canStart() {
        if(athletes.size() == this.numberOfAthletes); {
            return true;
        }
    }

    public void run() {
        if(canStart()) {
            for(Athlete athlete : athletes) {
                athlete.participate();
                this.awardMedal(athlete.calculatePoints());
            }
        }
    }

    public String awardMedal(int points) {
        if (points >= 15) {
            return "You have won a gold medal";
        } else if (points >= 10) {
            return "You have won a silver medal";
        } else if (points >= 5) {
            return "You have won a bronze medal";
        } else return "You suck";
    }
}
