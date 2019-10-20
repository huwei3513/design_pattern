package com.huwei.platform.designpattern.composite;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO",30000);
        Employee headSales = new Employee("Robert","Sales",20000);
        Employee headMarketing = new Employee("Michel","Marketing",20000);
        Employee clerk1 = new Employee("Laura","Marketing",10000);
        Employee clerk2 = new Employee("Bob","Marketing",10000);
        Employee salesExecutive1 = new Employee("Richard","Sales",10000);
        Employee salesExecutive2 = new Employee("Rob","Sales",10000);
        CEO.addSubordinate(headSales);
        CEO.addSubordinate(headMarketing);
        headSales.addSubordinate(salesExecutive1);
        headSales.addSubordinate(salesExecutive2);
        headMarketing.addSubordinate(clerk1);
        headMarketing.addSubordinate(clerk2);
        printEmployee(CEO);
    }

    private static void printEmployee(Employee employee) {
        System.out.println(employee);
        for (Employee subordinate : employee.getSubordinates()) {
            printEmployee(subordinate);
        }
    }
}
