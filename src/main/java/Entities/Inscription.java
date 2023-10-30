package Entities;

public class Inscription {
    private long numInscription ;
    private int numsemaine ;

    public long getNumInscription() {
        return numInscription;
    }

    public int getNumsemaine() {
        return numsemaine;
    }

    public Inscription(long numInscription, int numsemaine) {
        this.numInscription = numInscription;
        this.numsemaine = numsemaine;
    }

    public void setNumInscription(long numInscription) {
        this.numInscription = numInscription;
    }

    public void setNumsemaine(int numsemaine) {
        this.numsemaine = numsemaine;
    }
}
