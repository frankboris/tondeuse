package com.syndie.pelouse;

public class Pelouse {
    private int nbrLigne;
    private int nbrColonne;

    public Pelouse(int nbrLigne, int nbrColonne) {
        this.nbrLigne = nbrLigne;
        this.nbrColonne = nbrColonne;
    }

    public int getNbrLigne() {
        return nbrLigne;
    }

    public void setNbrLigne(int nbrLigne) {
        this.nbrLigne = nbrLigne;
    }

    public int getNbrColonne() {
        return nbrColonne;
    }

    public void setNbrColonne(int nbrColonne) {
        this.nbrColonne = nbrColonne;
    }

    public boolean estContenu(int abscisse, int ordonnee) {
        return (abscisse >= 0 && abscisse <= nbrColonne) && (ordonnee >= 0 && ordonnee <= nbrLigne);
    }
}
