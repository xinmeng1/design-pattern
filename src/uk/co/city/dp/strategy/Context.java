package uk.co.city.dp.strategy;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 22:52
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

