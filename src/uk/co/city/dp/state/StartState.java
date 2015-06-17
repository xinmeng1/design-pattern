package uk.co.city.dp.state;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 21:48
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
