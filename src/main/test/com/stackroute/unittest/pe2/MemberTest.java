package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    MemberVariable memberVariable;

    @Before
    public void setUp() throws Exception {

        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        memberVariable = null;
    }

    @Test
    public void TestMemberName() {
        String expectedValue = "Harry Potter";
        //Act
        String actualValue = memberVariable.memberName("Harry Potter");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestMemberAge() {
        int expectedValue = 30;
        //Act
        int actualValue = memberVariable.memberAge(30);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestMemberSalary() {
        long expectedValue = 48000;
        //Act
        long actualValue = memberVariable.memberSalary(48000);
        assertEquals(expectedValue, actualValue);
        //Assert

    }

    @Test
    public void TestFailure() {
        String actualValue_1 = memberVariable.memberName(null);
        assertNull(actualValue_1);

        int actualValue_2 = memberVariable.memberAge(0);
        assertEquals(0, actualValue_2);

        long actualValue_3 = memberVariable.memberSalary(0);
        assertEquals(0, actualValue_3);

    }
}