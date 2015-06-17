package uk.co.city.dp.observer;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 21:59
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}