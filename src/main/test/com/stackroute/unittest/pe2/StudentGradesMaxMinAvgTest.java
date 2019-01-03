package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesMaxMinAvgTest {

    StudentGradesMaxMinAvg q6;
    int a[] = new int[]{1,2,3,4,5};
    @Before
    public void setUp() throws Exception {


        q6=new StudentGradesMaxMinAvg();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void minimum() {
        assertEquals(1,q6.minimum(5,a));
    }

    @Test
    public void maximum() {
        assertEquals(5,q6.maximum(5,a));
    }

    @Test
    public void average() {
        assertEquals(3,q6.average(5,a),0.1);
    }
}