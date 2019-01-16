package fr.groupe4.cours.personnage;

import java.util.*;

public class Heros extends Personnage {

    public Heros() {
        creerHeros();
        setCarac();
    }

    public enum Noms {
        Ason("Ason"),
        Brandead("Brandead"),
        Dodbeorn("Dodbeorn"),
        Tibo("Tibo"),
        Leofuisen("Leofuisen"),
        Locthony("Locthony"),
        Nathna("Nathna"),
        Risadel("Risadel"),
        Rocty("Rocty"),
        Roychel("Roychel"),
        Trithy("Trithy"),
        Wigisum("Wigisum"),
        Wisebeo("Wisebeo");

        public String name;
        Noms(String name) {
            this.name = name;
        }
    }

    public static void creerHeros () {
        List<Noms> listeNoms = Collections.unmodifiableList(Arrays.asList(Noms.values()));
        int tailleListe = listeNoms.size();
        Random random = new Random();
        String randomNom = String.valueOf(listeNoms.get(random.nextInt(tailleListe)));

        System.out.println("Votre héros nommé " + randomNom + " apparaît. \nVeuillez lui assigner ses caractéristiques : ");
    }

    public void setCarac() {

        while (points > 0) {
            String entree;
            System.out.println("Que voulez-vous modifier ?");
            Scanner scanner = new Scanner(System.in);
            entree = scanner.nextLine();
            System.out.println("Vous avez " + points + " points");

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
        return valeur;
    }
    public void verifValeurMax(){
        if (getCaract("Force") > 15 || getCaract("Intelligence") > 15 || getCaract("Dextérité") > 15 || getCaract("Sagesse") > 15 || getCaract("Constitution") > 15){
            System.out.println("Vous ne pouvez pas avoir plus de 15 points dans une caractéristique");
            this.points+=this.valeur;
            this.valeur = 15;
        }
    }
    public int mettreCaract(String valeurCaract) {

        System.out.println("Combien voulez-vous assigner de points à " + valeurCaract + "?");
        valeur = Integer.valueOf(sc.nextLine());

        if (valeur >= 8 && valeur <= 15) {
            verifValeur(valeur, points);
            map.merge(valeurCaract, valeur, Integer::sum);
            points -= valeur;
            verifValeurMax();

        } else if (points <= 8) {
            verifValeur(valeur, points);
            map.merge(valeurCaract, valeur, Integer::sum);
            points -= valeur;
            verifValeurMax();

        } else {
            System.out.println("Vous devez assigner entre 8 et 15 points maximum à chaque capacité");
        }
        return valeur;
    }
}