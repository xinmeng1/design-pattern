package uk.co.city.dp.observer;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 21:58
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}