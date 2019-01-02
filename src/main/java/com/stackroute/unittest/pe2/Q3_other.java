package com.stackroute.unittest.pe2;

public class Q3_other {

    Q3_Member q3=new Q3_Member("uday",22,50000);
    public String name()
    {
//       System.out.println(q3.name);
        return q3.name;
    }

    public int  age()
    {
//        System.out.println(q3.age);
        return q3.age;
    }

    public double salary()
    {
//        System.out.println(q3.salary);
        return q3.salary;
    }

    public static  void main(String args[])
    {

        Q3_other q3_other=new Q3_other();
        q3_other.salary();
        q3_other.age();
        q3_other.name();
    }

}
