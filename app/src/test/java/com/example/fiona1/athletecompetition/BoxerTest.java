package com.example.fiona1.athletecompetition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class BoxerTest {

    private Boxer boxerGold;
    private Boxer boxerSilver;
    private Boxer boxerBronze;
    private Boxer boxerFailure;


    @Before
    public void setUp() throws Exception {
        boxerGold = new Boxer("Fred", 20, 3);
        boxerSilver = new Boxer("George", 15, 2);
        boxerBronze = new Boxer("Frank", 10, 1);
        boxerFailure = new Boxer("Barry", 1, 1);

    }

    @Test
    public void canPrepare() throws Exception {
        assertEquals("Fred is preparing for an event", boxerGold.prepare());
    }

    @Test
    public void canCompete() throws Exception {
        assertEquals("Competing in event!", boxerGold.compete());

    }

    @Test
    public void canCalculatePoints() throws Exception {
        assertEquals(17, boxerGold.calculatePoints());

    }

    @Test
    public void testAwardMedal() throws Exception {
        assertEquals("You have won a gold medal", boxerGold.awardMedal(boxerGold.calculatePoints()));
        assertEquals("You have won a silver medal", boxerSilver.awardMedal(boxerSilver.calculatePoints()));
        assertEquals("You have won a bronze medal", boxerBronze.awardMedal(boxerBronze.calculatePoints()));
        assertEquals("You suck", boxerFailure.awardMedal(boxerFailure.calculatePoints()));

    }

    @Test
    public void getLastRunDistance() throws Exception {
        boxerGold.run(20);
        assertEquals(20, boxerGold.getLastRunDistance());

    }

    @Test
    public void canGetTotalDistance() throws Exception {
        boxerGold.run(100);
        boxerGold.run(50);
        boxerGold.run(25);
        assertEquals(175, boxerGold.getTotalRunDistance());
    }
}
