package uk.co.city.dp.visitor;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 19/06/2015 - 14:29
 * Created by mengxin on 19/06/2015.
 * <p/>
 * File Description:
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}