package Entities;

public class cours {
    private long numcours ;
    private int niveau ;
    private typecours Typecours;
    private support Support;
    private float prix ;
    private int creneau ;


    public cours(long numcours, int niveau, typecours typecours, support support, float prix, int creneau) {
        this.numcours = numcours;
        this.niveau = niveau;
        Typecours = typecours;
        Support = support;
        this.prix = prix;
        this.creneau = creneau;
    }

    public long getNumcours() {
        return numcours;
    }

    public int getNiveau() {
        return niveau;
    }

    public typecours getTypecours() {
        return Typecours;
    }

    public support getSupport() {
        return Support;
    }

    public float getPrix() {
        return prix;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setNumcours(long numcours) {
        this.numcours = numcours;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setTypecours(typecours typecours) {
        Typecours = typecours;
    }

    public void setSupport(support support) {
        Support = support;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }

}



