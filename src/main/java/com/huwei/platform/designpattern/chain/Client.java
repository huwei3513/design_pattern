package com.huwei.platform.designpattern.chain;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    private static AbstractLogger getLoggerChain() {
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger();
        AbstractLogger consoleLogger = new ConsoleLogger();
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getLoggerChain();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }
}
