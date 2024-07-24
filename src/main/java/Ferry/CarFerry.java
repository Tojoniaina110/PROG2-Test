package Ferry;

import java.util.Date;

public class CarFerry extends Vehicule {

    public CarFerry(String adresse, Date dateNaissance, String nom, String prenom, Date dateDeVoyage, int numeroPermis, int immatriculation, int kilometrage, int longueur, String model, int poidVide, int reserve) {
        super(adresse, dateNaissance, nom, prenom, dateDeVoyage, numeroPermis, immatriculation, kilometrage, longueur, model, poidVide, reserve);
    }

    public void embarquer (){

    }

    public void debarquer() {


    }
}
