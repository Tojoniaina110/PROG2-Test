package Ferry;

import java.time.LocalDate;
import java.util.Date;

public class Vehicule  extends Conducteur {
        private String model;
        private int immatriculation;
        private int kilometrage;
        private int poidVide;
        private int longueur;
        private int reserve;

    public Vehicule(String adresse, LocalDate dateNaissance, String nom, String prenom, Date dateDeVoyage, int numeroPermis, int immatriculation, int kilometrage, int longueur, String model, int poidVide, int reserve) {
        super(adresse, 1 / 2023, nom, prenom, dateDeVoyage, numeroPermis);
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.longueur = longueur;
        this.model = model;
        this.poidVide = poidVide;
        this.reserve = reserve;
    }

    public Conducteur changerConducteur(Conducteur conducteur) {
        return conducteur;
    }
    public int getPoids() {
        return this.poidVide + this.reserve ;

    }

    public int allerALaPompe( int carburant) {
        return this.reserve + carburant;
    }

    public int rouler(Conducteur conducteur, int reserve, int distance) {
        if (reserve < this.poidVide || distance == reserve) {
            System.out.println("Le carburant est insuffisant !!! ");
        }
        else {
            if(this.reserve > distance) {
                System.out.println("Vous pouvez rouler environ " + distance + "km");

            }

        }

        return reserve;
    }
}
