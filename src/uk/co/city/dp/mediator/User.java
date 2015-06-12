package uk.co.city.dp.mediator;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 17:26
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}