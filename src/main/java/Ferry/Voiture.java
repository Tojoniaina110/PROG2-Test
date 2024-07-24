package Ferry;

import java.time.LocalDate;
import java.util.Date;

public class Voiture extends Vehicule{

    public Voiture(String adresse, LocalDate dateNaissance, String nom, String prenom, Date dateDeVoyage, int numeroPermis, int immatriculation, int kilometrage, int longueur, String model, int poidVide, int reserve) {
        super(adresse, dateNaissance, nom, prenom, dateDeVoyage, numeroPermis, immatriculation, kilometrage, longueur, model, poidVide, reserve);
    }
    public int  monter(){



        return 0;
    }

    public int descendre(){
        return 0;
    }





}
