package uk.co.city.dp.mediator;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 17:26
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}