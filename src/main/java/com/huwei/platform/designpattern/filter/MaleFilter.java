
package com.huwei.platform.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class MaleFilter implements PersonFilter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> males = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender() == Person.GENDER_MALE) {
                males.add(person);
            }
        }
        return males;
    }
}
