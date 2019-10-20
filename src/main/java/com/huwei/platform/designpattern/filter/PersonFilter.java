package com.huwei.platform.designpattern.filter;

import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public interface PersonFilter {

    /**
     * 过滤person
     *
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
