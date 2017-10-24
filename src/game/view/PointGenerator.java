package game.view;

import java.util.Random;

public class PointGenerator {

    public static void generatePoint(){

        Point point = new Point();

        int x = new Random().nextInt();
        point.setX(x);

        int y = new Random(x).nextInt();
        point.setY(y);

    }
}
