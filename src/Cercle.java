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

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Segment getRayon() {
        return rayon;
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

    public Cercle symetrie() {

        return new Cercle(centre.symetrie(), rayon.symetrie());

    }

    @Override
    public String toString() {
        return "rayon" + rayon.toString() + ", centre" + centre.toString() + ", |rayon|=" + rayon.distance() + ", Perimetre = " + perimetre() + ", Surface = " + surface();
    }
}
