package Ferry;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Voyageur extends Personne {
    private Instant dateDeVoyage;


    public Voyageur(String adresse, LocalDate dateNaissance, String nom, String prenom, Date dateDeVoyage) {
        super(adresse, dateNaissance, nom, prenom);
        this.dateDeVoyage = dateDeVoyage.toInstant();
    }

    public Instant getDateDeVoyage() {
        return dateDeVoyage;
    }

    public void setDateDeVoyage(Date dateDeVoyage) {
        this.dateDeVoyage = dateDeVoyage.toInstant();
    }
}
