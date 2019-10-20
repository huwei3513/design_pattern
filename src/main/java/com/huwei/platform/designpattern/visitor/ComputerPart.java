package com.huwei.platform.designpattern.visitor;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public interface ComputerPart {

    /**
     * 接受访问
     *
     * @param computerPartVisitor
     */
    void accept(ComputerPartVisitor computerPartVisitor);

    /**
     * 获取名字
     *
     * @return
     */
    String getName();
}
