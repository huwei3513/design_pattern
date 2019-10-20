package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class Client {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.work();
        compare(hungrySingleton,HungrySingleton.getInstance());

        IdlerSingleton idlerSingleton = IdlerSingleton.getInstance();
        idlerSingleton.work();
        compare(idlerSingleton,IdlerSingleton.getInstance());

        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        staticSingleton.work();
        compare(staticSingleton,StaticSingleton.getInstance());

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.work();
        compare(enumSingleton,EnumSingleton.INSTANCE);

        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        doubleCheckSingleton.work();
        compare(doubleCheckSingleton,DoubleCheckSingleton.getInstance());
    }

    private static void compare(Object singleton1,Object singleton2) {
        System.out.println(singleton1.equals(singleton2));
    }
}
