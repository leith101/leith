package Entities;

public class piste {
    private long numpiste;
    private String nompiste;
    private couleur Couleur;

    public void setNumpiste(long numpiste) {
        this.numpiste = numpiste;
    }

    public void setNompiste(String nompiste) {
        this.nompiste = nompiste;
    }

    public void setCouleur(couleur couleur) {
        Couleur = couleur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    public long getNumpiste() {
        return numpiste;
    }

    public String getNompiste() {
        return nompiste;
    }

    public couleur getCouleur() {
        return Couleur;
    }

    public int getLongeur() {
        return longeur;
    }

    public int getPente() {
        return pente;
    }

    public piste(long numpiste, String nompiste, couleur couleur, int longeur, int pente) {
        this.numpiste = numpiste;
        this.nompiste = nompiste;
        Couleur = couleur;
        this.longeur = longeur;
        this.pente = pente;
    }

    private  int longeur ;
    private int pente ;
}
