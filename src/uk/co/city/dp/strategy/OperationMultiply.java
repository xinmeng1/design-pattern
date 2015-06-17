package uk.co.city.dp.strategy;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-17 - 22:52
 * Created by MENGXIN on 2015-06-17.
 * <p/>
 * File Description:
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

