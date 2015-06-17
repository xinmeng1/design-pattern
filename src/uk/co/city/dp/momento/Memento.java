package uk.co.city.dp.momento;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 16:41
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}