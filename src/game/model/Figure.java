package game.model;

public class Figure {

    private final String figure;

    public Figure(final String figureName) {
        this.figure=figureName;

    }

    public String getFigure(){
        return figure;
    }
    @Override
    public String toString(){
        return this.getFigure();
    }

}
