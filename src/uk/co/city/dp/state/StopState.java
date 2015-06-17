package uk.co.city.dp.state;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 21:53
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}