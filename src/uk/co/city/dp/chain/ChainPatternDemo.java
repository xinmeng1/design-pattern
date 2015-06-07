package uk.co.city.dp.chain;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 11:26
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        System.out.print("DP职责链:职责链构造完毕\n");
        return errorLogger;
    }

    public static void main(String[] args) {

        //Design Pattern 职责链演示程序
        AbstractLogger loggerChain = getChainOfLoggers();

        System.out.print("DP职责链:下面开始使用职责链输出log\n");
        System.out.print("DP职责链:======INFO LEVEL=======\n");
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        System.out.print("DP职责链:======DEBUG LEVEL=======\n");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        System.out.print("DP职责链:======ERROR LEVEL=======\n");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

        System.out.print("DP职责链:======INVISIBLE LEVEL=======\n");
        loggerChain.logMessage(0,
                "This information can not be output.");
    }
}
