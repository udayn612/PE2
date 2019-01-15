package com.stackroute.unittest.pe2;

import java.util.Scanner;

/**Write a boolean method called isEven() in a class called EvenNumTest, which takes an int as input and returns true if the input is even.
 * The signature of the method is as follows: public static boolean isEven(int number)
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class EvenOddCheck {

    public static boolean isEven(int n) {

        if (n % 2 == 0)
            return true;
        else
            return false;
    }

}
