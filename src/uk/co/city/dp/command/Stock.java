package uk.co.city.dp.command;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 21:46
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
