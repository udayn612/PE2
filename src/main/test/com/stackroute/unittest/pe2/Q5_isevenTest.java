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
        assertEquals(5,Q5_iseven.isEven());
    }
    @Test
    public void isEvenFailure() {
        assertNotEquals(5,Q5_iseven.isEven());
    }
}