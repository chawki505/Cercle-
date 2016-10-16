/**
 * Created by chawki on 14/10/16.
 */
public class Segment {

    private Point point1 = new Point();
    private Point point2 = new Point();

    //constructeur pour un segment OM avec O(0,0) et M(x,y)
    public Segment(Point point) {

        this.point2 = point;
    }

    //constructeur pour un segment AB avec A(xa,ya) et B(xb,yb)
    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double distance() {
        return Math.sqrt(Math.pow(point2.getAbscisse() - point1.getAbscisse(), 2) + Math.pow(point2.getOrdonnee() - point1.getOrdonnee(), 2));
    }

    public Segment symetrie() {

        return new Segment(point1.symetrie(), point2.symetrie());


    }

    @Override
    public String toString() {
        return "[" + point1.toString() + point2.toString() + "]";
    }
}
