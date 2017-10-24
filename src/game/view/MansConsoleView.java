package game.view;

import game.controller.GameController;

public class MansConsoleView extends ConsoleView{
    public MansConsoleView(GameController gameController){
        super(gameController);
    }

    @Override
    public void showGameName() {
        showLine(3);
        System.out.println(gameController.getGameName());
    }
}
