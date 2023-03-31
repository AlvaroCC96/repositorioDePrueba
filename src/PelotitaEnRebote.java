import edu.princeton.cs.stdlib.StdDraw;
public class PelotitaEnRebote {
    public static void main(String[] args) {
        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();

        double x = min + (max-min) * Math.random();
        double y = min + (max-min) * Math.random();

        double vx = 0.012;
        double vy = 0.032;

        double radio = 0.05;


        while (true) {
            if (Math.abs(x+vx) > 1.0 - radio){
                vx = -vx;
            }

            if (Math.abs(y+vy) > 1.0 - radio){
                vy = -vy;
            }

            x+=vx;
            y+=vy;

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x,y,radio);

            StdDraw.show();
        }
    }
}
