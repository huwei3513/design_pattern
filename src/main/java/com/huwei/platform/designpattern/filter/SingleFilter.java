package com.huwei.platform.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class SingleFilter implements PersonFilter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singles = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus() == Person.UNMARRIED) {
                singles.add(person);
            }
        }
        return singles;
    }
}
