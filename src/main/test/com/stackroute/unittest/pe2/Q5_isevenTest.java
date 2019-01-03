package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_isevenTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEvenSuccess() {
        assertEquals(true,Q5_iseven.isEven(2));
    }
    @Test
    public void isEvenFailure() {
        assertNotEquals(false,Q5_iseven.isEven(4));
    }
}