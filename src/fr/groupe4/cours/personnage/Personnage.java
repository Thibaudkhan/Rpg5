package fr.groupe4.cours.personnage;

import java.util.HashMap;
import java.util.Map;

public class Personnage {


    public Map<String, Integer> caracteristique = new HashMap<String, Integer>();   //Pourquoi static????

        caracteristique.put("Force" , 10);/*
        caracteristique.put("Int" , 10);
        caracteristique.put("Dext" , 10);
        caracteristique.put("Sag" , 10);
        caracteristique.put("Const" , 10);*/
        Integer force = caracteristique.getOrDefault("Force", 10);


    public int getElement(String carac){
        int nbCarac;
        switch (carac){
            case "Force":
                nbCarac = force ;
                return nbCarac;
        }
    }


    public Personnage() {

    }
}
