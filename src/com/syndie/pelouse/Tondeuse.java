package com.syndie.pelouse;

public class Tondeuse {
    private int abscisse;
    private int ordonnee;
    private char orientation;

    public Tondeuse(int abscisse, int ordonnee, char orientation) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.orientation = orientation;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public void avance() {
        switch (this.orientation) {
            case Direction.EST:
                this.incrementerAbscisse();
                break;
            case Direction.SUD:
                this.decrementerOrdonnee();
                break;
            case Direction.NORD:
                this.incrementerOrdonnee();
                break;
            case Direction.OUEST:
                this.decrementerAbscisse();
                break;
        }
    }

    public void gauche() {
        switch (this.orientation) {
            case Direction.EST:
                this.setOrientation(Direction.NORD);
                break;
            case Direction.SUD:
                this.setOrientation(Direction.EST);
                break;
            case Direction.NORD:
                this.setOrientation(Direction.OUEST);
                break;
            case Direction.OUEST:
                this.setOrientation(Direction.SUD);
                break;
        }
    }

    public void droite() {
        switch (this.orientation) {
            case Direction.EST:
                this.setOrientation(Direction.SUD);
                break;
            case Direction.SUD:
                this.setOrientation(Direction.OUEST);
                break;
            case Direction.NORD:
                this.setOrientation(Direction.EST);
                break;
            case Direction.OUEST:
                this.setOrientation(Direction.NORD);
                break;
        }
    }

    public void incrementerAbscisse() {
        this.abscisse++;
    }

    public void incrementerOrdonnee() {
        this.ordonnee++;
    }

    public void decrementerAbscisse() {
        this.abscisse--;
    }

    public void decrementerOrdonnee() {
        this.ordonnee--;
    }

    public String getPosition() {
        return this.abscisse + " " + this.ordonnee + " " + this.orientation;
    }
}
