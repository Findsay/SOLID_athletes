package com.example.fiona1.athletecompetition;

import java.util.ArrayList;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class RunApp implements AthleteLog {

    private ArrayList<Integer> runLog;

    public RunApp() {
        this.runLog = new ArrayList<Integer>();
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

    public void addDistance(int distance){
        runLog.add(distance);
    }
}
