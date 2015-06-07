package uk.co.city.dp.chain;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 11:15
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
