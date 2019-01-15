package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;

public class Personnage {


    private Map<String, Integer> caracteristique;

    private Integer force = caracteristique.getOrDefault("Force", 10);
    private Integer intell = caracteristique.getOrDefault("Int", 10);
    private Integer dexterite = caracteristique.getOrDefault("Dext", 10);
    private Integer sagesse = caracteristique.getOrDefault("Sag", 10);
    private Integer constitution = caracteristique.getOrDefault("Const", 10);

    public Personnage() {

        caracteristique = new HashMap<>();

        caracteristique.put("Force" , 10);
        caracteristique.put("Int" , 10);
        caracteristique.put("Dext" , 10);
        caracteristique.put("Sag" , 10);
        caracteristique.put("Const" , 10);

    }

    public int getElement(String carac){
        int nbCarac = 0;
        switch (carac){
            case "Force":
                nbCarac = force ;
            case "Intelligence":
                nbCarac = intell ;
            case "Dextérité" :
                nbCarac = dexterite;
            case "Sagesse" :
                nbCarac = sagesse;
            case "Constitution" :
                nbCarac = constitution;
            default :
                nbCarac = 0;
        }
        return nbCarac;
    }
}
