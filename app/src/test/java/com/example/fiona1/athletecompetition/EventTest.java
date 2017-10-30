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


    @Before
    public void setUp() throws Exception {
        event = new Event("Gymnastics", 2);
        gymnast1 = new Gymnast("Barry", 4, 2);
        gymnast2 = new Gymnast("Larry", 10, 5);
    }

    @Test
    public void eventCanStart() throws Exception {
        event.addAthlete(gymnast1);
        event.addAthlete(gymnast2);
        assertEquals(true, event.canStart());
    }



    @Test
    public void run() throws Exception {
        event.addAthlete(gymnast1);
        event.addAthlete(gymnast2);
        event.run();
    }
}
