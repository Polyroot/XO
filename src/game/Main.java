package game;


import game.controller.GameController;
import game.model.Board;
import game.model.ContactBuilder;
import game.model.Figure;
import game.model.Contact;
import game.model.Player;
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

        final Contact contact = new ContactBuilder()
                .name("Sasha")
                .surname("Rezov")
                .mail("1@mail.ru")
                .address("ololo27")
                .build();



    }

    private static void printFigure(Figure figure){
        System.out.println(figure);
        if ("X".equals(figure.getFigure())){
            System.out.println("!!!!!!!");
        }
    }

}
