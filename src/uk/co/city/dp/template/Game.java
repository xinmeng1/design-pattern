package uk.co.city.dp.template;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 10:58
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
