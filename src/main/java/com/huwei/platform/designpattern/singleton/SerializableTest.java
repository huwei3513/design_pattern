package com.huwei.platform.designpattern.singleton;

import java.io.*;

/**
 * @author huwei
 * @date 2023/4/25
 */
public class SerializableTest {

    public static void main(String[] args) {
        SerializableSingleton singleton1 = null;
        SerializableSingleton singleton2 = SerializableSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            singleton1 = (SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton1 == singleton2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
