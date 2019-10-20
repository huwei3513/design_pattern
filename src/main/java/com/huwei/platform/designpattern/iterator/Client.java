package com.huwei.platform.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class Client {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
