package uk.co.city.dp.visitor;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 19/06/2015 - 14:28
 * Created by mengxin on 19/06/2015.
 * <p/>
 * File Description:
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}