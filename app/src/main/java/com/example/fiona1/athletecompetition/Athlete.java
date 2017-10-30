package com.example.fiona1.athletecompetition;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public abstract class Athlete implements AthleteLog {

    private String name;
    ArrayList<Integer> runLog;

    public Athlete(String name) {
        this.name = name;
        this.runLog = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void enterEvent(Event event) {
        event.addAthlete(this);
    }

    public String prepare() {
        return this.name + " is preparing for an event";
    }

    public String compete() {
        return "Competing in event!";
    }

    public abstract int calculatePoints();

    public String awardMedal(int points) {
        if (points >= 15) {
            return "You have won a gold medal";
        } else if (points >= 10) {
            return "You have won a silver medal";
        } else if (points >= 5) {
            return "You have won a bronze medal";
        } else return "You suck";
    }

    public void participate(){
        System.out.println(prepare());
        System.out.println(compete());
        System.out.println(awardMedal(calculatePoints()));
    }

    @Override
    public void run(Integer distance) {
        runLog.add(distance);
    }

    @Override
    public int getLastRunDistance() {
        return runLog.get(runLog.size()-1);
    }

    @Override
    public int getTotalRunDistance() {
        int total = 0;
        for (Integer session : runLog) {
            total += session;
        }
        return total;
    }

    public void printLog() {
        System.out.println("Total distance: " + getTotalRunDistance());
        System.out.println("Sessions: ");
        for(Integer session : runLog) {
            System.out.println(session);
        }
    }


}
