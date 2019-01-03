package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    Member q3;
    @Before
    public void setUp() throws Exception {

        q3=new Member();
    }

    @After
    public void tearDown() throws Exception {
        q3=null;
    }

    @Test
    public void name() {
        assertEquals("uday",q3.name());
    }

    @Test
    public void age() {
        assertEquals(22,q3.age());

    }

    @Test
    public void salary() {
        assertEquals(50000,q3.salary(),0);
    }
}