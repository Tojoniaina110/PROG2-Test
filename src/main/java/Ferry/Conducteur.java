package Ferry;

import java.util.Date;

public class Conducteur extends Voyageur{
        private int numeroPermis;

    public Conducteur(String adresse, int dateNaissance, String nom, String prenom, Date dateDeVoyage, int numeroPermis) {
        super(adresse, dateNaissance, nom, prenom, dateDeVoyage);
        this.numeroPermis = numeroPermis;
    }

    public int getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(int numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
}
