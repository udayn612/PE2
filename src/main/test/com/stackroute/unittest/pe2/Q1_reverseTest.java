package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_reverseTest {

    Q1_reverse q1;
    @Before
    public void setUp() throws Exception {
        q1=new Q1_reverse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reversetest()
    {

    }

    @Test
    public void reverse() {

        assertEquals("cba",q1.reverse("abc"));

    }

    @Test
    public void ispallindrome() {

        assertEquals(false,q1.ispallindrome("abc"));
    }
}