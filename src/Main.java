/**
 * Created by chawki on 15/10/16.
 */
public class Main {


    public static void main(String[] args) {

        Point A = new Point();
        Point B = new Point(5, 5);
        Point C = new Point(3, 8);

        Segment AB = new Segment(A, B);
        Segment BC = new Segment(B, C);

        Cercle cercle1 = new Cercle(A,AB);
        Cercle cercle2 = new Cercle(B, BC);

        System.out.println("cercle 1 " + cercle1.toString() + " / perimetre = " + cercle1.perimetre() + " / surface = " + cercle1.surface());
        System.out.println("Image de c1 = " + cercle1.symetrie(cercle1));

        System.out.println("\ncercle 2 " + cercle2.toString() + " / perimetre = " + cercle2.perimetre() + " / surface = " + cercle2.surface());
        System.out.println("Image de c2 = " + cercle2.symetrie(cercle2));
    }
}
