package com.huwei.platform.designpattern.chain;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger() {
        this.level = AbstractLogger.INFO;
    }

    @Override
    void write(String msg) {
        System.out.println("Standard Console::Logger: " + msg);
    }
}
