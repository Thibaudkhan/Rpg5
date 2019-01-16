package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personnage {

    Map<String, Integer> map = new HashMap<>();
    int points = 30;
    int valeur = 0;
    Scanner sc = new Scanner(System.in);


    public Personnage() {


        map.put("Force", 0);
        map.put("Intelligence", 0);
        map.put("Dextérité", 0);
        map.put("Sagesse", 0);
        map.put("Constitution", 0);

        setCarac();

    }

    public void setCarac() {
        while (points > 0) {

            String entree;
            System.out.println("Que voulez-vous modifier ?");
            Scanner scanner = new Scanner(System.in);
            entree = scanner.nextLine();
            System.out.println("Vous avez " + points + "points");

            switch (entree) {
                case "Force":


                    mettreCaract("Force");
                    break;

                case "Intelligence":


                    mettreCaract("Intelligence");
                    break;


                case "Dextérité":


                    mettreCaract("Dextérité");
                    break;

                case "Sagesse":


                    mettreCaract("Sagesse");
                    break;

                case "Constitution":


                    mettreCaract("Constitution");
                    break;

                default:
                    System.out.println("Vous n'avez rien choisi");
                    break;
            }

            System.out.println("Il vous reste " + points + " points.");

        }
        System.out.println(map);
    }

    public int verifValeur(int valeur, int points) {
        if (valeur >= points) {
            this.valeur = this.points;
        }
        return valeur;

    }

    public int mettreCaract(String valeurCaract) {

        System.out.println("Combien voulez-vous assigner de points à " + valeurCaract + "?");
        valeur = Integer.valueOf(sc.nextLine());
        if (valeur >= 8 && valeur <= 15) {
            verifValeur(valeur, points);
            map.merge(valeurCaract, valeur, Integer::sum);
            points -= valeur;

        } else {
            System.out.println("Vous devez assigner entre 8 et 15 points maximum à chaque capacité");
        }
        return valeur;
    }

    /*public int setElement(String carac, int trucEnPlus) {
        switch (carac) {
            case "Force":
                force = caracteristique.put("Force", trucEnPlus);
                System.out.println(force);
                return force;

            case "Intelligence":
                intell = caracteristique.put("Int", trucEnPlus);
                System.out.println("Hello Case intell");
                return intell;

            case "Dextérité":
                dexterite = caracteristique.put("Dext", trucEnPlus);
                return dexterite;

            case "Sagesse":
                sagesse = caracteristique.put("Sag", trucEnPlus);
                return sagesse;

            case "Constitution":
                constitution = caracteristique.put("Const", trucEnPlus);
                return constitution;

            default:
                return 0;
        }

    }*/
}
