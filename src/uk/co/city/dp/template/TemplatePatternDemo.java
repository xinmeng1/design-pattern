package uk.co.city.dp.template;

/**
 * Project: design-pattern
 * Author: Xin Meng
 * Date: 12/06/2015 - 11:02
 * Created by mengxin on 12/06/2015.
 * <p/>
 * File Description:
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}