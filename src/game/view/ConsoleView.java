package game.view;

import game.controller.Game;
import game.model.Figure;
import game.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    private static final String LINE_CHARACTER = "~";
    private static final int LINE_SIZE = 11;
    private final static Scanner IN = new Scanner(System.in);

    protected final Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void showGameName(){
        System.out.println(game.getGameName());

    }

    public void showPlayersName(){
        System.out.println(game.getPlayers());
    }

    public void showBoard(){
        for (int i=0; i<3; i++){
            showBoardLine(i);
            showLine(LINE_SIZE);
        }

    }

    public void showPlayers(){
//        for (int i=0; i<game.getPlayers().length; i++) {
//            System.out.println(game.getPlayers()[i]);
//        }
        for (Player player : game.getPlayers()){
            System.out.println(player.getName());
        }
    }

    private void showBoardLine(final int row){
        for (int i=0; i<3; i++){
            System.out.println(game.getBoard().getFigure(row, i));
        }
        System.out.println();
    }

    private void showLine(final int size){
        for (int i=1; i<size; i++){
            System.out.print(LINE_CHARACTER);
        }
        System.out.println();
    }

    private int getCoordinate(final String coordinateName){
        int counter=0;
        do{
            System.out.print(String.format("Input the coordinate %s:", coordinateName));
            try{
                final Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (final InputMismatchException e) {
                System.out.println("Coordinate is incorrect");
                counter +=1;
            }
            return -1;
        } while(counter<3);
    }

    public void start(){
        System.out.println("Please Input coordinates");
        int x = getCoordinate("X");
        int y = getCoordinate("Y");
    }


}
