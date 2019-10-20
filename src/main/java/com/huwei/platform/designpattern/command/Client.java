package com.huwei.platform.designpattern.command;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-07
 */
public class Client {

    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
