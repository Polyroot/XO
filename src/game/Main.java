package game;


import game.controller.GameController;
import game.model.Board;
import game.model.Figure;
import game.model.Player;
import game.view.ConsoleView;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();

        GameController gameController = new GameController(null, null, board);
//        gameController.;

        Figure figureX = new Figure("X");
        Figure figure0 = new Figure("0");
        board.setFigure(0,0, figure0);
        System.out.println(board.getFigure(0,0));

    }
}
