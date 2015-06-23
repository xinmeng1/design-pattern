package uk.co.city.dp.visitor;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 19/06/2015 - 14:40
 * Created by mengxin on 19/06/2015.
 * <p/>
 * File Description:
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());

        ComputerPart keyboard = new Keyboard();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPart monitor = new Monitor();
        monitor.accept(new ComputerPartDisplayVisitor());
    }
}