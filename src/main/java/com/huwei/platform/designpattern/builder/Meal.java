package com.huwei.platform.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    private void addItem(Item item) {
        this.items.add(item);
    }

    private float getCosts() {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    private void showItems() {
        for (Item item : items) {
            System.out.print("Item:" + item.name());
            System.out.print(",packing:" + item.packing().pack());
            System.out.println(",price:" + item.price());
        }
    }
}
