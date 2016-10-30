/**
 * Created by HP on 30/10/2016.
 */
public class Point2 {
        private double x, y;


        public Point2(double x, double y) {

            this.x = x;
            this.y = y;
        }

        public Point2(double x) {
            this.x = x;
            this.y = x;

        }

        public Point2() {
            this.x = this.y = 0;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }


        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
    }

