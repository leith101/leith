package Entities;

import java.time.LocalDate;

public class skiteur {
    private long numskieur ;
    private String nomS ;
    private String prenomS ;
    private LocalDate dateNaissance;
    private String ville ;

    public skiteur(long numskieur, String nomS, String prenomS, LocalDate dateNaissance, String ville) {
        this.numskieur = numskieur;
        this.nomS = nomS;
        this.prenomS = prenomS;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    public long getNumskieur() {
        return numskieur;
    }

    public String getNomS() {
        return nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setNumskieur(long numskieur) {
        this.numskieur = numskieur;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
