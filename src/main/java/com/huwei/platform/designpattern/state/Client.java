package com.huwei.platform.designpattern.state;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
