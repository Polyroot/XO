package game.model;

import game.helpers.CoordinateHelper;


public class Board {


    private static final int SIZE_FIELD=3;
    public Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public Figure getFigure(final int x, final int y) {
        if (CoordinateHelper.checkCoordinate(x) == false || CoordinateHelper.checkCoordinate(y) == false) return null;
        return figures[x][y];
    }

    public boolean setFigure(final int x, final int y, final Figure figure){
        if (CoordinateHelper.checkCoordinate(x) == false||CoordinateHelper.checkCoordinate(y)==false)
            return false;

        if (figures[x][y] != null) return false;

        figures[x][y] = figure;
        return true;
    }

    public void showBoard(){
        System.out.print(this.figures);


    }


}
