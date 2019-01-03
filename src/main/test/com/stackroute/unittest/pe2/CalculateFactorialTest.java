package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFactorialTest {

    CalculateFactorial q7;

    @Before
    public void setUp() throws Exception {

        q7=new CalculateFactorial();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorial() {

        assertEquals(24,q7.factorial(4));
    }
}