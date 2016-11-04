
/**
 * Created by chawki on 14/10/16.
 */

//import java.util.*;
public class Point {
    private int abscisse;
    private int ordonnee;
/*
Scanner key = new Scanner(System.in);
double C;
*/
    //constructeur par defaut
    public Point() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    //constructeur de point symetrique
    public Point(int x) {
        this.abscisse = x;
        this.ordonnee = x;
    }

    //constructeur
    public Point(int x, int y) {
        this.abscisse = x;
        this.ordonnee = y;
    }

    //retoune la valeur de l'axe des x
    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    //retoune la valeur de l'axe des y
    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    //calcule de limage
    public Point symetrie() {

        return new Point(-abscisse, ordonnee);

    }
 /*
   ------------------------------------------------------------------------
   | Création d'une methode qui lit les Coordonnée d'un point donnee       |
   |_______________________________________________________________________|
   | public void mesCoord(){                                               |
   |            System.out.println("Donner l'Abcisse du point ");          |
   |			C=key.nextDouble();                                        |
   |			setAbcisse(C);                                             |
   |			System.out.println("Donner l'Ordonnee du point ");         |
   |		    C=key.nextDouble();                                        |
   |		    setOrdonnee(C);                                            |
   |	}                                                                  |
    ------------------------------------------------------------------------
    */
    //affichage du point (x,y)
    @Override
    public String toString() {
        return "(" + abscisse + ";" + ordonnee + ")";
    }



    public void deplace(int dx, int dy) {
        abscisse += dx;
        ordonnee += dy;
}
}

