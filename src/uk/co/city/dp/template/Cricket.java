package uk.co.city.dp.template;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 11:01
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}