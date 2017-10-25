package game;

import game.controller.GameController;
import game.model.Board;
import game.model.Figure;
import game.view.ConsoleView;

public class Main {
    public static void main(String[] args) {

//        Board board = new Board();
//
//        GameController gameController = new GameController(null, null, board);
////        gameController.;
//
//        Figure figureX = new Figure("X");
//        Figure figure0 = new Figure("0");
//        board.setFigure(0,0, figure0);
//        System.out.println(board.getFigure(0,0));

//        Figure  figureX = new Figure("X");
//
//        printFigure(figureX);


        Board board = new Board();
        board.setFigure(0,0,Figure.X);
        board.setFigure(1,1,Figure.X);
        board.setFigure(0,1,Figure.O);

        for (Figure f : Figure.values()){
            System.out.println(f);
        }
        Figure f = Figure.valueOf("X");

        final GameController gameController = new GameController(null, null, board);
        final ConsoleView consoleView = new ConsoleView(gameController);
        consoleView.showBoard();


    }

    private static void printFigure(Figure figure){
        System.out.println(figure);
        if ("X".equals(figure.getFigure())){
            System.out.println("!!!!!!!");
        }
    }

}
