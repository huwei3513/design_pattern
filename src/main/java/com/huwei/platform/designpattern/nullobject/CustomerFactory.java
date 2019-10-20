package com.huwei.platform.designpattern.nullobject;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class CustomerFactory {

    public static final String[] names = {"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
