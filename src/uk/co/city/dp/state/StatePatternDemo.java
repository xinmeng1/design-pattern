package uk.co.city.dp.state;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 21:54
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */

public class StatePatternDemo {
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