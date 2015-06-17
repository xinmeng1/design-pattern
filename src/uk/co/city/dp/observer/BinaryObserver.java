package uk.co.city.dp.observer;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 21:56
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}