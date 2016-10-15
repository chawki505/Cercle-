/**
 * Created by chawki on 15/10/16.
 */
public class Cercle {

    private Point centre;
    private Segment rayon;

    public Cercle() {
        this.centre = new Point();

    }

    public Cercle(Point centre, Segment rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }


    public Point getCentre() {
        return centre;
    }

    public Segment getRayon() {
        return rayon;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRayon(Segment rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return this.rayon.distance() * 2 * Math.PI;
    }

    public double surface() {
        return this.rayon.distance() * this.rayon.distance() * Math.PI;
    }

    public String symetrie(Cercle cercle) {

        Cercle image = new Cercle(cercle.getCentre().symetrie(cercle.getCentre()), cercle.getRayon().symetrie(cercle.getRayon()));
        return "centre" + image.getCentre().toString() + ", rayon=" + image.getRayon().distance()+"/ Segment"+image.rayon.toString();
    }

    @Override
    public String toString() {
        return "Segment"+rayon.toString()+  " centre" + getCentre().toString() + ", rayon=" + getRayon().distance();
    }
}
