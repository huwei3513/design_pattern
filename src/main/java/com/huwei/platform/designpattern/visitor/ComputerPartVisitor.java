package com.huwei.platform.designpattern.visitor;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public interface ComputerPartVisitor {
    /**
     * 访问
     *
     * @param computerPart
     */
    void visit(ComputerPart computerPart);
}
