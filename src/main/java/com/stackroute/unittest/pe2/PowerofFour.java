package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class PowerofFour {

    public boolean isPower4(long n)
    {

        if(n == 0)
        return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }


        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        PowerofFour powerofFour = new PowerofFour();


        System.out.println(powerofFour.isPower4(n));
    }
}
