package uk.co.city.dp.chain;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-06 - 11:12
 * Created by MENGXIN on 2015-06-06.
 * <p/>
 * File Description:
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){

        //这里可以改进, 一旦一个级别处理了任务,就不需要给下一个环节了
        if(this.level <= level){
            System.out.print("DP职责链:负责该职责,打印信息\n");
            write(message);
        }else{
            if(nextLogger !=null){
                System.out.print("DP职责链:不负责该职责,转入到职责链下一环进行处理\n");
                nextLogger.logMessage(level, message);
            }else{
                System.out.print("DP职责链:责任链结束,没有发现可以处理该任务的类.\n");
            }
        }
    }

    abstract protected void write(String message);
}
