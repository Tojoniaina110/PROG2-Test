package Ferry;

import java.time.LocalDate;
import java.util.Date;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;

    public Personne(String adresse, LocalDate dateNaissance, String nom, String prenom) {
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate  getDateNaissance() {
        return dateNaissance;
    }

    public LocalDate setDateNaissance(LocalDate  dateNaissance) {
        this.dateNaissance = dateNaissance;
        return dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void voyager(){}
}
