package com.syndie.pelouse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileContent = Util.getFileContent("test.txt");
        System.out.println("Nombre de ligne : " + fileContent.size());

        String[] taille = fileContent.get(0).split(" ");
        Pelouse pelouse = new Pelouse(Integer.parseInt(taille[0]), Integer.parseInt(taille[1]));

        for (int i = 1; i < fileContent.size(); i++) {
            String[] initials = fileContent.get(i).split(" ");
            Tondeuse tondeuse = new Tondeuse(Integer.parseInt(initials[0]), Integer.parseInt(initials[1]), initials[2].charAt(0));
            i++;
            String mouvements = fileContent.get(i);
            System.out.println(mouvements);
            for (int k = 0; k < mouvements.length(); k++) {
                char mouvement = mouvements.charAt(k);
                if (mouvement == Mouvement.GAUCHE) {
                    tondeuse.gauche();
                } else if (mouvement == Mouvement.DROITE) {
                    tondeuse.droite();
                } else if (mouvement == Mouvement.AVANCE) {
                    tondeuse.avance();
                    if (!pelouse.estContenu(tondeuse.getAbscisse(), tondeuse.getOrdonnee())) {
                        System.out.println("Hors pelouse k=" + k);
                        tondeuse.incrementerOrdonnee();
                    }
                }
            }
            System.out.println(tondeuse.getPosition());
        }
    }
}
