package uk.co.city.dp.momento;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 2015-06-13 - 16:41
 * Created by MENGXIN on 2015-06-13.
 * <p/>
 * File Description:
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}