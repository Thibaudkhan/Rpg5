package fr.groupe4.cours.personnage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Heros {

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
    public void CreerHeros() {
        List<Noms> listeNoms = Collections.unmodifiableList(Arrays.asList(Noms.values()));
        int tailleListe = listeNoms.size();
        Random random = new Random();
        String randomNom = String.valueOf(listeNoms.get(random.nextInt(tailleListe)));
        System.out.println("Votre héros nommé " + randomNom + " apparaît. \nVeuillez lui assigner ses caractéristiques :");
        System.out.println(randomNom);

    }
}