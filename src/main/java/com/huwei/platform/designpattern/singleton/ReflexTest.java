package com.huwei.platform.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author huwei
 * @date 2023/4/25
 */
public class ReflexTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = HungrySingleton.class;
            Constructor<?> c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object obj1 = c.newInstance();
            Object obj2 = c.newInstance();
            System.out.println(obj1 == obj2);
        } catch (NoSuchMethodException | InvocationTargetException
                | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
