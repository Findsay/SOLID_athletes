package com.example.fiona1.athletecompetition;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public abstract class Athlete {

    private String name;
    private RunApp runLog;

    public Athlete(String name, RunApp runLog) {
        this.name = name;
        this.runLog = runLog;
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

//    public String awardMedal(int points) {
//        if (points >= 15) {
//            return "You have won a gold medal";
//        } else if (points >= 10) {
//            return "You have won a silver medal";
//        } else if (points >= 5) {
//            return "You have won a bronze medal";
//        } else return "You suck";
//    }

    public void participate(){
        System.out.println(prepare());
        System.out.println(compete());
//        System.out.println(awardMedal(calculatePoints()));
    }


    public void run(Integer distance) {
        runLog.addDistance(distance);
    }

    public int getLastRunDistance() {
        return runLog.getLastRunDistance();
    }


    public int getTotalRunDistance() {
        return runLog.getTotalRunDistance();
    }

    public void printLog() {
        runLog.printLog();
    }


}
