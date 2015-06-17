package uk.co.city.dp.observer;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 21:53
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}