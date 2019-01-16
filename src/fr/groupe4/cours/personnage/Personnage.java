package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personnage {

    protected Map<String, Integer> map = new HashMap<>();
    protected int points = 60;
    protected int valeur = 0;
    protected int vie;
    Scanner sc = new Scanner(System.in);

    public Personnage() {

        map.put("Force", 0);
        map.put("Intelligence", 0);
        map.put("Dextérité", 0);
        map.put("Sagesse", 0);
        map.put("Constitution", 0);
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
