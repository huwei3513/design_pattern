package com.huwei.platform.designpattern.template;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public abstract class AbstractGame {

    /**
     * 初始化
     */
    abstract void initialize();

    /**
     * 开始
     */
    abstract void startPlay();

    /**
     * 结束
     */
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play() {

        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
