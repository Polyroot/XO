package game.view;

import game.controller.Game;

public class AdvConsoleView extends ConsoleView{


    public AdvConsoleView(final Game game) {
        super(game);
    }
    @Override
    public void showGameName(){
        System.out.println("***");
        System.out.println(game.getGameName());

    }



}
