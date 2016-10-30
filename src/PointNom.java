/**
 * Created by user on 30/10/2016.
 */

    public class PointNom extends Point {

        private String nom;

        public PointNom(String nom, int x, int y) {
            super(x, y);
            this.nom = nom;
        }

        public PointNom(String nom, int x) {
            super(x);
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }

        public void afficheCor() {
            System.out.println(nom + "( " + getAbscisse() + " , " + getOrdonnee() + " )");
        }
}
