package fr.groupe4.cours;

import fr.groupe4.cours.personnage.Heros;
import fr.groupe4.cours.personnage.Race;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println("test");
        Heros heros = new Heros();
        heros.choixRace();
        Race es = new Race();
        //System.out.println(perso.setElement("Ftaejkgn,dlk,l,lrce", 15));
        createRace();
    }

    private static void createRace() {
        boolean choix = false;
        Scanner sc = new Scanner(System.in);
        String nxtln = sc.nextLine();
        while (!choix) {
            if (nxtln.equals("Orc")) {
                System.out.println("Votre choix est Orc");
                choix = true;
            } else if (nxtln.equals("Elfe")) {
                System.out.println("Votre choix est Elfe");
                choix = true;
            } else {
                System.out.println("Votre choix n'est pas valide");
                nxtln = sc.nextLine();
                choix = false;
            }
        }
    }
}

