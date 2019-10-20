package com.huwei.platform.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
