package Entities;

import java.time.LocalDate;

public class abonnement {
    private long numabon ;
    private LocalDate datedebut ;
    private LocalDate datefin ;

    public void setNumabon(long numabon) {
        this.numabon = numabon;
    }

    public void setDatedebut(LocalDate datedebut) {
        this.datedebut = datedebut;
    }

    public void setDatefin(LocalDate datefin) {
        this.datefin = datefin;
    }

    public void setPrixabon(float prixabon) {
        this.prixabon = prixabon;
    }

    public void setTypeabonnement(typeabonnement typeabonnement) {
        Typeabonnement = typeabonnement;
    }

    public long getNumabon() {
        return numabon;
    }

    public LocalDate getDatedebut() {
        return datedebut;
    }

    public LocalDate getDatefin() {
        return datefin;
    }

    public float getPrixabon() {
        return prixabon;
    }

    public typeabonnement getTypeabonnement() {
        return Typeabonnement;
    }

    public abonnement(long numabon, LocalDate datedebut, LocalDate datefin, float prixabon, typeabonnement typeabonnement) {
        this.numabon = numabon;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.prixabon = prixabon;
        Typeabonnement = typeabonnement;
    }

    private float prixabon ;
    private typeabonnement Typeabonnement ;
}

