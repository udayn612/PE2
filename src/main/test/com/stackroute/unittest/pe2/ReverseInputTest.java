package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseInputTest {

    ReverseInput reverseInput;
    @Before
    public void setUp() throws Exception {
        reverseInput=new ReverseInput();
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

        assertEquals("cba",reverseInput.reverse("abc"));

    }

    @Test
    public void ispallindrome() {

        assertEquals(false,reverseInput.isPallindrome("abc"));
    }
}