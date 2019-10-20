package com.huwei.platform.designpattern.filter;

import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class AndFilter implements PersonFilter {

    private PersonFilter filter1;
    private PersonFilter filter2;

    public AndFilter(PersonFilter filter1,PersonFilter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return filter2.meetCriteria(filter1.meetCriteria(persons));
    }
}
