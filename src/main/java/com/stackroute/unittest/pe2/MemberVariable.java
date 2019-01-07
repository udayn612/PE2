package com.stackroute.unittest.pe2;

public class MemberVariable {

    Member member=new Member();

    public String memberName(String name)
    {
        member.setName(name);
        return member.getName();
    }

    public int memberAge(int age)
    {
        member.setAge(age);
        return member.getAge();
    }

    public double memberSalary(int salary)
    {
        member.setSalary(salary);
        return member.getSalary();
    }
}
