package com.huwei.platform.designpattern.mediator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
