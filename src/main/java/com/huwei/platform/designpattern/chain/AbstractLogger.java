package com.huwei.platform.designpattern.chain;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level,message);
        }
    }

    /**
     * 写入
     *
     * @param msg
     */
    abstract void write(String msg);
}
