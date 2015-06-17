package uk.co.city.dp.observer;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 21:56
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
