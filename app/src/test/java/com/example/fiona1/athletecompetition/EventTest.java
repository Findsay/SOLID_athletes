package com.example.fiona1.athletecompetition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 30/10/2017.
 */

public class EventTest {

    Event event;
    Gymnast gymnast1;
    Gymnast gymnast2;
    RunApp runLog1;
    RunApp runLog2;


    @Before
    public void setUp() throws Exception {
        event = new Event("Gymnastics", 2);
        gymnast1 = new Gymnast("Barry", runLog1, 4, 2);
        gymnast2 = new Gymnast("Larry", runLog2, 10, 5);
    }

    @Test
    public void eventCanStart() throws Exception {
        event.addAthlete(gymnast1);
        event.addAthlete(gymnast2);
        assertEquals(true, event.canStart());
    }

    @Test
    public void testAwardMedal() throws Exception {
        assertEquals("You have won a gold medal", event.awardMedal(gymnast2.calculatePoints()));
        assertEquals("You have won a bronze medal", event.awardMedal(gymnast1.calculatePoints()));
    }



    @Test
    public void run() throws Exception {
        event.addAthlete(gymnast1);
        event.addAthlete(gymnast2);
        event.run();
    }
}
