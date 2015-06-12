package uk.co.city.dp.template;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 11:01
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}