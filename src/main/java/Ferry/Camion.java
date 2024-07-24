package Ferry;

import java.time.LocalDate;
import java.util.Date;

public class Camion extends  Vehicule {
    private String descColis;
    private int poidColis;

    public Camion(String adresse, LocalDate dateNaissance, String nom, String prenom, Date dateDeVoyage, int numeroPermis, int immatriculation, int kilometrage, int longueur, String model, int poidVide, int reserve, String descColis, int poidColis) {
        super(adresse, dateNaissance, nom, prenom, dateDeVoyage, numeroPermis, immatriculation, kilometrage, longueur, model, poidVide, reserve);
        this.descColis = descColis;
        this.poidColis = 0;
    }
    public int  ajouterColis(){
        this.poidColis++;
        return poidColis;
    }
    public int retireClois(){
        this.poidColis--;
        return poidColis;
    }



}
