package Entities;

import java.time.LocalDate;

public class moniteur {
    private long numMoniteur ;
    private String nomM;
    private String prenomM;
    private LocalDate daterecu;

    public long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public LocalDate getDaterecu() {
        return daterecu;
    }

    public void setDaterecu(LocalDate daterecu) {
        this.daterecu = daterecu;
    }

    public moniteur(long numMoniteur, String nomM, String prenomM, LocalDate daterecu) {
        this.numMoniteur = numMoniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.daterecu = daterecu;
    }
}
