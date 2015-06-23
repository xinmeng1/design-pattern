package uk.co.city.dp.visitor;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 19/06/2015 - 14:37
 * Created by mengxin on 19/06/2015.
 * <p/>
 * File Description:
 */
public class Computer implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
