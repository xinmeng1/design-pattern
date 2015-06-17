package uk.co.city.dp.state;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 21:49
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
