package com.huwei.platform.designpattern.builder;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class Client {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showItems();
        System.out.println("Total cost:" + vegMeal.getCosts());
        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal:");
        nonVegMeal.showItems();
        System.out.println("Total cost:" + nonVegMeal.getCosts());
    }
}
