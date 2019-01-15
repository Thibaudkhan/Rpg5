package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personnage {

    Map<String, Integer> map = new HashMap<>();

    public Personnage() {

        int points = 30;

        map.put("Force", 0);
        map.put("Intelligence", 0);
        map.put("Dextérité", 0);
        map.put("Sagesse", 0);
        map.put("Constitution", 0);

        while (points != 0) {
        String entree;
        System.out.println("Que voulez-vous modifier ?");
        Scanner scanner = new Scanner(System.in);
        entree = scanner.nextLine();
            switch (entree) {
                case "Force":
                    System.out.println("Vous avez " + points);
                    System.out.println("Combien voulez-vous assigner de points à force ?");
                    Scanner sc = new Scanner(System.in);
                    int valeurForce = Integer.valueOf(sc.nextLine());
                    map.replace("Force", valeurForce);
                    points -= valeurForce;
                    System.out.println("Il vous reste " + points + " points.");
                    break;
                case "Intelligence":
                    System.out.println("Vous avez " + points);
                    System.out.println("Combien voulez-vous assigner de points à intelligence ?");
                    Scanner sc2 = new Scanner(System.in);
                    int valeurIntelligence = Integer.valueOf(sc2.nextLine());
                    map.replace("Force", valeurIntelligence);
                    points -= valeurIntelligence;
                    System.out.println("Il vous reste " + points + " points.");
                    break;
                case "Dextérité":
                    System.out.println("Vous avez " + points);
                    System.out.println("Combien voulez-vous assigner de points à dextérité ?");
                    Scanner sc3 = new Scanner(System.in);
                    int valeurDexterite = Integer.valueOf(sc3.nextLine());
                    map.replace("Force", valeurDexterite);
                    points -= valeurDexterite;
                    System.out.println("Il vous reste " + points + " points.");
                    break;
                case "Sagesse":
                    System.out.println("Vous avez " + points);
                    System.out.println("Combien voulez-vous assigner de points à sagesse ?");
                    Scanner sc4 = new Scanner(System.in);
                    int valeurSagesse = Integer.valueOf(sc4.nextLine());
                    map.replace("Force", valeurSagesse);
                    points -= valeurSagesse;
                    System.out.println("Il vous reste " + points + " points.");
                    break;
                case "Constitution":
                    System.out.println("Vous avez " + points);
                    System.out.println("Combien voulez-vous assigner de points à constitution ?");
                    Scanner sc5 = new Scanner(System.in);
                    int valeurConstitution = Integer.valueOf(sc5.nextLine());
                    map.replace("Force", valeurConstitution);
                    points -= valeurConstitution;
                    System.out.println("Il vous reste " + points + " points.");
                    break;
                default:
                    System.out.println("Vous n'avez rien choisi");
                    break;
            }
        }

        System.out.println(map);
    }
}
