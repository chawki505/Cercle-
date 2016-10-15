/**
 * Created by chawki on 14/10/16.
 */
public class Segment {

    private Point point1 = new Point();
    private Point point2 = new Point();

    //constructeur pour un segment OM avec O(0,0) et M(x,y)
    Segment(Point point) {

        this.point2 = point;
    }

    //constructeur pour un segment AB avec A(xa,ya) et B(xb,yb)
    Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double distance() {
        return  Math.sqrt(Math.pow(getPoint2().getAbscisse() - getPoint1().getAbscisse(), 2) + Math.pow(getPoint2().getOrdonnee() - getPoint1().getOrdonnee(), 2));
    }

    public Segment symetrie(Segment segment) {

        Segment image = new Segment(segment.getPoint1().symetrie(segment.getPoint1()), segment.getPoint2().symetrie(segment.getPoint2()));

        return image;
    }

    @Override
    public String toString() {
        return getPoint1().toString() + getPoint2().toString();
    }
}
