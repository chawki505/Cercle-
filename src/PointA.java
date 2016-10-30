/**
 * Created by HP on 30/10/2016.
 */
    public class PointA extends Point {

             public PointA( int x, int y) {
                    super(x, y);
                }

            public PointA(String nom, int x) {
                   super( x);
               }


             public void afficheCor() {
                    System.out.println( "( " + getAbscisse() + " , " + getOrdonnee() + " )");
                }
 }
