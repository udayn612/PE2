package com.stackroute.unittest.pe2;

import java.util.Scanner;


/**Write a Java method to check if a given number is power of 4
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class PowerofFour {

    public boolean isPower4(long n) {

        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }

        return true;
    }

}
