package uk.co.city.dp.visitor;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 19/06/2015 - 14:39
 * Created by mengxin on 19/06/2015.
 * <p/>
 * File Description:
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}