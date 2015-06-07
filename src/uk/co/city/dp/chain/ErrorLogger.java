package uk.co.city.dp.chain;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 11:16
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
