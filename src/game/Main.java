package game;


import game.controller.Game;
import game.model.Board;
import game.model.Figure;
import game.model.Player;
import game.view.AdvConsoleView;
import game.view.ConsoleView;
import game.view.MenuViev;

public class Main {
    public static void main(String[] args) {

        final Board board = new Board();
        final Game game = new Game(board, new Player[]{new Player("Gleb", new Figure("O")),
                                                       new Player("Slava", new Figure("X"))});
        new ConsoleView(game).showPlayers();

        MenuViev menu = new MenuViev();
        menu.getChoice();


//        board.initArray();
//        board.showBoard();


//        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
//        final ConsoleView consoleView = new ConsoleView(game);
//        startGame(advConsoleView);
    }

//    public static void startGame(final ConsoleView advConsoleView){
//        advConsoleView.showGameName();
//    }

}
