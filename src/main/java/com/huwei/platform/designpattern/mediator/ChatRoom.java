package com.huwei.platform.designpattern.mediator;

import java.util.Date;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class ChatRoom {

    public static void showMessage(User user,String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
