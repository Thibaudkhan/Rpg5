package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personnage {

    private Map<String, Integer> map = new HashMap<>();
    private int points = 60;
    private int valeur = 0;
    private int vie;
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
        vie = map.get("Constitution");
        System.out.println(map);
    }

    public int verifValeur(int valeur, int points) {

        if (valeur >= points) {
            this.valeur = this.points;
        }
        if (valeur >15){
            System.out.println("Vous ne pouvez pas avoir plus de 15 points dans un caractéristique");
            valeur = 15;
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

        } else if (points <= 8) {
            verifValeur(valeur, points);
            map.merge(valeurCaract, valeur, Integer::sum);
            points -= valeur;

        } else {
            System.out.println("Vous devez assigner entre 8 et 15 points maximum à chaque capacité");
        }
        return valeur;
    }

    public int getCaract(String carac) {
        switch (carac) {
            case "Force":
                return map.get("Force");
            case "Intelligence":
                return map.get("Intelligence");
            case "Dextérité":
                return map.get("Dextérité");
            case "Sagesse":
                return map.get("Sagesse");
            case "Constitution":
                return map.get("Constitution");
            case "Vie":
                return vie;
            default:
                return 0;
        }
    }
}
