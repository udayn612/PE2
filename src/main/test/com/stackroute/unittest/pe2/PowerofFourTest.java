package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerofFourTest {

    PowerofFour powerofFour;

    @Before
    public void setUp() throws Exception {
        powerofFour = new PowerofFour();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPower4() {
        assertEquals(false, powerofFour.isPower4(3));
    }

    @Test
    public void isPower4Failure() {
        assertNotEquals(false, powerofFour.isPower4(4));
    }
}