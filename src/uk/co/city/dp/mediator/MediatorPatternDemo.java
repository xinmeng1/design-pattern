package uk.co.city.dp.mediator;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 17:26
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}