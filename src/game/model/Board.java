package game.model;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Board {


    private static final int SIZE_FIELD=3;
    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public void initArray(){


    }

    public void showBoard(){
        System.out.println(deepToString(this.figures));

    }

    public Figure[][] getFigure(int row, int i) {
        return figures;
    }
}
