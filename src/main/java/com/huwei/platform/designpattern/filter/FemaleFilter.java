package com.huwei.platform.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class FemaleFilter implements PersonFilter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> females = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender() == Person.GENDER_FEMALE) {
                females.add(person);
            }
        }
        return females;
    }
}
