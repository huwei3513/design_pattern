package com.huwei.platform.designpattern.visitor;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(ComputerPart computerPart) {
        System.out.println("Displaying:" + computerPart.getName());
    }
}
