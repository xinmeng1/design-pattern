package uk.co.city.dp.momento;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 16:41
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}