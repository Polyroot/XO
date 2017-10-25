package game.model;

public enum Figure {

    X("X"), O("O");

    private final String figure;

    Figure(final String figureName) {
        this.figure=figureName;

    }

    public String getFigure(){
        return figure;
    }


}
