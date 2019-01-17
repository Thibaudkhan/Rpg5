package fr.groupe4.cours;

import fr.groupe4.cours.personnage.Heros;
import fr.groupe4.cours.personnage.Race;
import fr.groupe4.cours.personnage.RaceEnum;
import fr.groupe4.cours.personnage.persoClasse.EnnemiEnum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println("test");
        generateMonster();
        Heros heros = new Heros();

        heros.choixRace();
        //System.out.println(perso.setElement("Ftaejkgn,dlk,l,lrce", 15));
    }

    public static EnnemiEnum generateMonster(){
        int nb = (int) (Math.random() * 6 );
        EnnemiEnum ennemi = null;
        if (nb == 0){
            ennemi  = EnnemiEnum.ORC1;
        }
        else if (nb == 1){
            ennemi  = EnnemiEnum.ORC2;
        }
        else if (nb == 2){
            ennemi  = EnnemiEnum.ORC3;
        }
        else if (nb == 3){
            ennemi  = EnnemiEnum.GOBELIN1;
        }
        else if (nb == 4){
            ennemi  = EnnemiEnum.GOBELIN2;
        }
        else if (nb == 5){
            ennemi  = EnnemiEnum.GOBELIN3;
        }
        System.out.println(ennemi);
        return ennemi;
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

