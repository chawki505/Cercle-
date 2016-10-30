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

        Cercle cercle1 = new Cercle(A, AB);
        Cercle cercle2 = new Cercle(B, BC);



        System.out.println("\n---UPDATE----");

        PointNom point1 = new PointNom("X", 10, 5);
        PointNom point2 = new PointNom("Y", 2);

        PointA p = new PointA(10);



        System.out.println("Avant:");
        point1.afficheCor();//afficher le point
        point2.afficheCor();

        point1.deplace(5, -5);//deplacer le point
        point2.deplace(1,2);

        System.out.println("\nApres:");
        point1.afficheCor();//afficher le nouveau deplacement
        point2.afficheCor();

        System.out.println("---UPDATE----\n");

        System.out.println("A" + A.toString() + "\nB" + B.toString() + "\nC" + C.toString());
        System.out.println("\nimage de A = A-1" + A.symetrie().toString() + "\nimage de B = B-1" + B.symetrie().toString() + "\nimage de C = C-1" + C.symetrie().toString());

        System.out.println("\nSegment AB" + AB.toString() + "\nSegment BC" + BC.toString());
        System.out.println("\nImage de AB = BA" + AB.symetrie().toString() + "\nImage de BC = CB" + BC.symetrie().toString());

        System.out.println("\ncercle c1 : " + cercle1.toString() + "\ncercle c2 : " + cercle2.toString());
        System.out.println("\nImage de c1 : " + cercle1.symetrie().toString() + "\nImage de c2 : " + cercle2.symetrie().toString());


    }
}
