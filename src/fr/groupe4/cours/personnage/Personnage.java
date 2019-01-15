package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personnage {

    Map<String, Integer> map = new HashMap<>();
    int points = 30;
    int valeur = 0;

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
            Scanner sc = new Scanner(System.in);
            entree = scanner.nextLine();
            System.out.println("Vous avez " + points);

            switch (entree) {
                case "Force":

                    System.out.println("Combien voulez-vous assigner de points à force ?");
                    valeur = Integer.valueOf(sc.nextLine());
                    verifValeur(valeur, points);
                    map.replace("Force", valeur);
                    points -= valeur;
                    break;

                case "Intelligence":

                    System.out.println("Combien voulez-vous assigner de points à intelligence ?");
                    valeur = Integer.valueOf(sc.nextLine());
                    verifValeur(valeur, points);
                    map.replace("Intelligence", valeur);
                    points -= valeur;
                    break;

                case "Dextérité":

                    System.out.println("Combien voulez-vous assigner de points à dextérité ?");
                    valeur = Integer.valueOf(sc.nextLine());
                    verifValeur(valeur, points);
                    map.replace("Dextérité", valeur);
                    points -= valeur;
                    break;

                case "Sagesse":

                    System.out.println("Combien voulez-vous assigner de points à sagesse ?");
                    valeur = Integer.valueOf(sc.nextLine());
                    verifValeur(valeur, points);
                    map.replace("Sagesse", valeur);
                    points -= valeur;
                    break;

                case "Constitution":

                    System.out.println("Combien voulez-vous assigner de points à constitution ?");
                    valeur = Integer.valueOf(sc.nextLine());
                    verifValeur(valeur, points);
                    map.replace("Constitution", valeur);
                    points -= valeur;
                    break;

                default:
                    System.out.println("Vous n'avez rien choisi");
                    break;
            }

            System.out.println("Il vous reste " + points + " points.");

        }
        System.out.println(map);
    }

    public int verifValeur (int valeur, int points) {
        if (valeur >= points) {
            this.valeur = this.points;
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
