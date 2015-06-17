package uk.co.city.dp.strategy;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 22:53
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMinus());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}