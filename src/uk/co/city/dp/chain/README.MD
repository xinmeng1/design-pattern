# Chain of Responsibility Pattern

## Case1

As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request. This pattern comes under behavioral patterns.

In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

职责链就是我们在设计功能的时候, 不能缺失由哪个模块来处理, 可以通过参数的带入在链条中搜索合适的类来进行处理. 通过划分不同级别打印日志信息是最好的例子, 如果不用职责链, 我们想到的应该是通过 switch case 来处理不同的参数, 但是问题是职责链有以下有点:

1. 可以对请求者和处理者关系的解耦提高代码的灵活性

例如我们可以增加一个级别来处理其他日志输出.

### Implementation

We have created an abstract class AbstractLogger with a level of logging. Then we have created three types of loggers extending the AbstractLogger. Each logger checks the level of message to its level and print accordingly otherwise does not print and pass the message to its next logger.

![image](chain_pattern_uml_diagram.jpg)

#### Step 1
Create an abstract logger class.

AbstractLogger.java

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
          if(this.level <= level){
             write(message);
          }
          if(nextLogger !=null){
             nextLogger.logMessage(level, message);
          }
       }

       abstract protected void write(String message);

    }
#### Step 2
Create concrete classes extending the logger.

ConsoleLogger.java

    public class ConsoleLogger extends AbstractLogger {

       public ConsoleLogger(int level){
          this.level = level;
       }

       @Override
       protected void write(String message) {
          System.out.println("Standard Console::Logger: " + message);
       }
    }
ErrorLogger.java

    public class ErrorLogger extends AbstractLogger {

       public ErrorLogger(int level){
          this.level = level;
       }

       @Override
       protected void write(String message) {
          System.out.println("Error Console::Logger: " + message);
       }
    }
FileLogger.java

    public class FileLogger extends AbstractLogger {

       public FileLogger(int level){
          this.level = level;
       }

       @Override
       protected void write(String message) {
          System.out.println("File::Logger: " + message);
       }
    }
#### Step 3
Create different types of loggers. Assign them error levels and set next logger in each logger. Next logger in each logger represents the part of the chain.

ChainPatternDemo.java

    public class ChainPatternDemo {

       private static AbstractLogger getChainOfLoggers(){

          AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
          AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
          AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

          errorLogger.setNextLogger(fileLogger);
          fileLogger.setNextLogger(consoleLogger);

          return errorLogger;
       }

       public static void main(String[] args) {
          AbstractLogger loggerChain = getChainOfLoggers();

          loggerChain.logMessage(AbstractLogger.INFO,
             "This is an information.");

          loggerChain.logMessage(AbstractLogger.DEBUG,
             "This is an debug level information.");

          loggerChain.logMessage(AbstractLogger.ERROR,
             "This is an error information.");
       }
    }
#### Step 4
Verify the output.

    Standard Console::Logger: This is an information.
    File::Logger: This is an debug level information.
    Standard Console::Logger: This is an debug level information.
    Error Console::Logger: This is an error information.
    File::Logger: This is an error information.
    Standard Console::Logger: This is an error information.

## Case 2

