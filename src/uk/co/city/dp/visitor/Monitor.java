package uk.co.city.dp.visitor;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 19/06/2015 - 14:39
 * Created by mengxin on 19/06/2015.
 * <p/>
 * File Description:
 */

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}