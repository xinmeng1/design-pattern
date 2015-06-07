package uk.co.city.dp.command;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 21:47
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    //可以将接口类型的参数作为方法参数，在实际是使用时可以将实现了接口的类传递给方法，后方法或按照重写的原则执行，实际调用的是实现类中的方法代码体，这样便根据传进入的参数的不同而实现不同的功能。
    //重要的是，当我以后还有另外一个对象并且拥有接受说生命的方法的时候的时候，我们不必须原类，只需新的类实现借口即可。

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
