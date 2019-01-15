    package com.stackroute.unittest.pe2;

    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;

    import static org.junit.Assert.*;

    public class StudentGradesMaxMinAvgTest {

        StudentGradesMaxMinAvg studentGradesMaxMinAvg;
        int a[] = new int[]{1, 2, 3, 4, 5};

        @Before
        public void setUp() throws Exception {


            studentGradesMaxMinAvg = new StudentGradesMaxMinAvg();

        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void minimum() {
            assertEquals(1, studentGradesMaxMinAvg.minimum(5, a));
        }

        @Test
        public void maximum() {
            assertEquals(5, studentGradesMaxMinAvg.maximum(5, a));
        }

        @Test
        public void average() {
            assertEquals(3, studentGradesMaxMinAvg.average(5, a), 0.1);
        }


        @Test
        public void minimumFailure() {
            assertNotEquals(2, studentGradesMaxMinAvg.maximum(5, a));
        }

        @Test
        public void maximumFailure() {
            assertNotEquals(2, studentGradesMaxMinAvg.maximum(5, a));
        }

        @Test
        public void averageFailure() {
            assertNotEquals(2, studentGradesMaxMinAvg.average(5, a));
        }
    }