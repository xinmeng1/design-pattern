package uk.co.city.dp.command;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 21:47
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
