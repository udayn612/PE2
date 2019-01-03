package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Q2_powerof4 {

    public boolean ispower4(long n)
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

        Q2_powerof4 q2 = new Q2_powerof4();


        System.out.println(q2.ispower4(n));
    }
}
