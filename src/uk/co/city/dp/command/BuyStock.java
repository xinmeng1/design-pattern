package uk.co.city.dp.command;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 21:46
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
