package com.huwei.platform.designpattern.singleton;

import java.io.Serializable;

/**
 * @author huwei
 * @date 2023/4/25
 */
public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = 6650893858827005642L;

    private SerializableSingleton() {
    }

    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
