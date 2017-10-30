package com.example.fiona1.athletecompetition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class GymnastTest {
    Event event;
    Gymnast gymnastGold;

    @Before
    public void setUp() throws Exception {
        gymnastGold = new Gymnast("Gary", 10, 5);
        event = new Event("Gymnastics", 1);

    }

    @Test
    public void canPrepare() throws Exception {
        assertEquals("Gary is preparing for an event", gymnastGold.prepare());

    }

    @Test
    public void canCompete() throws Exception {
        assertEquals("Competing in event!", gymnastGold.compete());

    }

    @Test
    public void canGetMedal() throws Exception {
        assertEquals("You have won a gold medal", gymnastGold.awardMedal(gymnastGold.calculatePoints()));

    }

    @Test
    public void getLastRun() throws Exception {
        gymnastGold.run(20);
        assertEquals(20, gymnastGold.getLastRunDistance());
    }

    @Test
    public void getTotalDistance() throws Exception {
        gymnastGold.run(100);
        gymnastGold.run(100);
        gymnastGold.run(100);
        assertEquals(300, gymnastGold.getTotalRunDistance());
    }

    @Test
    public void print() throws Exception {
        gymnastGold.run(100);
        gymnastGold.run(100);
        gymnastGold.run(100);
        gymnastGold.printLog();
    }

    @Test
    public void addAthlete() throws Exception {
        gymnastGold.enterEvent(event);
        assertEquals(1, event.getNumberofCompetitors());
    }
}
