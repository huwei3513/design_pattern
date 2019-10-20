package com.huwei.platform.designpattern.command;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-07
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
