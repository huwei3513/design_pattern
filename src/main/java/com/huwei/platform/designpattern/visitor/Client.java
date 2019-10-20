package com.huwei.platform.designpattern.visitor;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Client {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
