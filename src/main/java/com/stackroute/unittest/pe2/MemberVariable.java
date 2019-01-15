package com.stackroute.unittest.pe2;


/**Create a class named Member with Name, age, Salary as its variable, w
 * rite an other class named Member Variable that creates an instance of the Member class, initialises its member variables,
 * and then displays the value of each member variable.
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class MemberVariable {

    Member member = new Member();

    public String memberName(String name) {
        member.setName(name);
        return member.getName();
    }

    public int memberAge(int age) {
        member.setAge(age);
        return member.getAge();
    }

    public long memberSalary(long salary) {
        member.setSalary(salary);
        return member.getSalary();
    }
}
