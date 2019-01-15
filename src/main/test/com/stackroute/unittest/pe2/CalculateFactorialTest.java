package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFactorialTest {

    CalculateFactorial calculateFactorial;

    @Before
    public void setUp() throws Exception {

        calculateFactorial = new CalculateFactorial();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorialSuccess() {

        assertEquals(24, calculateFactorial.factorial(4));
    }

    @Test
    public void factorialFailure() {
        assertNotEquals(23, calculateFactorial.factorial(4));
    }
}