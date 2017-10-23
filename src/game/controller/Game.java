package game.controller;

import game.model.Board;
import game.model.Figure;
import game.model.Player;

public class Game {

    private static final int MIN_COORDINATE=0;

    private static final int MAX_COORDINATE=2;
    private static final int PLAYERS_COUNT=2;


    private static final String GAME_NAME = "XO";

    private final Board board;




    private Player[] players = new Player[]{new Player("Max", new Figure("O")),
                                            new Player("Leo", new Figure("X"))};

    public Game(Board board, final Player[] players) {
        this.players = players;
        this.board = board;
    }

    public String getGameName(){
        return Game.GAME_NAME;
    }

    public Player currentPlayer(){
        return null;
    }

    public Board getBoard() {
        return board;
    }


    public boolean move(final int x, final int y){

        assert x>=0;
        assert y>=0;

        if (checkCoordinate(x) == false  || checkCoordinate(y)== false) {
            return false;
        }

        return true;
    }

    public Player[] getPlayers() {
        return players;
    }

    private static boolean checkCoordinate(final int coordinate){
        if (coordinate<MIN_COORDINATE || coordinate>MAX_COORDINATE) return false;
        return true;
    }

}
