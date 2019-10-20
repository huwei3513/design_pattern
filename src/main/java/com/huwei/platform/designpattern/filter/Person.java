package com.huwei.platform.designpattern.filter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Person {

    public static final int GENDER_MALE = 0;
    public static final int GENDER_FEMALE = 1;
    public static final int MARRIED = 1;
    public static final int UNMARRIED = 0;

    private String name;
    private int gender;
    private int maritalStatus;

    public Person(String name,int gender,int maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(int maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
