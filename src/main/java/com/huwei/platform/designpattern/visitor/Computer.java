package com.huwei.platform.designpattern.visitor;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

    @Override
    public String getName() {
        return "computer";
    }
}
