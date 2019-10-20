package com.huwei.platform.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class OrFilter implements PersonFilter {

    private PersonFilter filter1;
    private PersonFilter filter2;

    public OrFilter(PersonFilter filter1,PersonFilter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> results = filter1.meetCriteria(persons);
        List<Person> tempList = filter2.meetCriteria(persons);
        for (Person person : tempList) {
            if (!results.contains(person)) {
                results.add(person);
            }
        }
        return results;
    }
}
