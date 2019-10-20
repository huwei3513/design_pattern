package com.huwei.platform.designpattern.chain;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class FileLogger extends AbstractLogger {

    public FileLogger() {
        this.level = AbstractLogger.DEBUG;
    }

    @Override
    void write(String msg) {
        System.out.println("File::Logger: " + msg);
    }
}
