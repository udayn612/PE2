package com.stackroute.unittest.pe2;

public class Member {

    MemberVariable q3=new MemberVariable("uday",22,50000);
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

        Member member =new Member();
        member.salary();
        member.age();
        member.name();
    }

}
