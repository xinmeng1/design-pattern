package uk.co.city.dp.chain;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 11:17
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
