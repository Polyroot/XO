package game.view;

public class Dot {

    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Dot d = new Dot(0,0);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                if(d.getX()!=d.getY()){
                    System.out.printf("0_0, %d, %d\n", d.getX(), d.getY());
                }
            }
        }).start();

        for (int i2=0; i2<2_000_000_000; i2++)
            for (int i=0; i<100; i++){
                d.setX(i);
                d.setY(i);
            }

    }



}
