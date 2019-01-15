package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;

public class Personnage {


    private Map<String, Integer> caracteristique;

    private int force;
    private int intell;
    private int dexterite;
    private int sagesse;
    private int constitution;

    public Personnage() {

        caracteristique = new HashMap<>();

        caracteristique.put("Force" , 10);
        caracteristique.put("Int" , 10);
        caracteristique.put("Dext" , 10);
        caracteristique.put("Sag" , 10);
        caracteristique.put("Const" , 10);

    }

    public int getElement(String carac){
        int nbCarac;
        switch (carac){
            case "Force":
                force =  caracteristique.getOrDefault("Force", 10);
                nbCarac = force ;
                break;

            case "Intelligence":
                intell = caracteristique.getOrDefault("Int", 10);
                nbCarac = intell ;
                break;

            case "Dextérité" :
                dexterite = caracteristique.getOrDefault("Dext", 10);
                nbCarac = dexterite;
                break;

            case "Sagesse" :
                sagesse = caracteristique.getOrDefault("Sag", 10);
                nbCarac = sagesse;
                break;

            case "Constitution" :
                constitution = caracteristique.getOrDefault("Const", 10);
                nbCarac = constitution;
                break;

            default :
                nbCarac = 0;
        }
        return nbCarac;
    }
}
