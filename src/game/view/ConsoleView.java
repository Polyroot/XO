package game.view;

import game.controller.GameController;
import game.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    private static final String LINE_CHARACTER = "~";

    private static final int LINE_SIZE = 11;

    private final static Scanner IN = new Scanner(System.in);

    protected final GameController gameController;

    public ConsoleView(final GameController gameController) {
        assert gameController != null;
        this.gameController = gameController;
    }

    public void start(){
        System.out.println("Please Input coordinates");
        int x = getCoordinate("X");
        int y = getCoordinate("Y");
    }

    public void showGameName(){
        System.out.println(gameController.getGameName());

    }

    public void showPlayersName(){
        System.out.println(gameController.getPlayers());
    }

    public void showBoard(){
        for (int i=0; i<3; i++){
            showBoardLine(i);
            showLine(LINE_SIZE);
        }

    }

    public void showPlayers(){

        for (Player player : gameController.getPlayers()){
            System.out.println(player.getName());
        }
    }

    protected void showLine(final int size){
        for (int i=1; i<size; i++){
            System.out.print(LINE_CHARACTER);
        }
        System.out.println();
    }

    private void showBoardLine(final int row){
        for (int i=0; i<3; i++){
            System.out.println(gameController.getBoard().getFigure(row, i));
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
                counter += 1;
            }
        } while(counter<3);
        return -1;
    }




}
