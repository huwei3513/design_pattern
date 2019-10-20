package com.huwei.platform.designpattern.chain;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.level = AbstractLogger.ERROR;
    }

    @Override
    void write(String msg) {
        System.out.println("Error Console::Logger: " + msg);
    }
}
