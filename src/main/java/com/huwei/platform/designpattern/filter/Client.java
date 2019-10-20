package com.huwei.platform.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert",0,0));
        persons.add(new Person("John",0,1));
        persons.add(new Person("Laura",1,1));
        persons.add(new Person("Diana",1,0));
        persons.add(new Person("Mike",0,0));
        persons.add(new Person("Bobby",0,0));

        PersonFilter maleFilter = new MaleFilter();
        PersonFilter femaleFilter = new FemaleFilter();
        PersonFilter singleFilter = new SingleFilter();
        PersonFilter singleMaleFilter = new AndFilter(singleFilter,maleFilter);
        PersonFilter singleOrFemaleFilter = new OrFilter(singleFilter,femaleFilter);

        System.out.println("Males: ");
        printPersons(maleFilter.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(femaleFilter.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMaleFilter.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemaleFilter.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
