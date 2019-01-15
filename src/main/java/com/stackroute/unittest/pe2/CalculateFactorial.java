package com.stackroute.unittest.pe2;

import java.util.Scanner;


/**Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer).
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class CalculateFactorial {

    public long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }


}
