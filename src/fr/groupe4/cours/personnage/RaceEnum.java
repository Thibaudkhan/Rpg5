package fr.groupe4.cours.personnage;

public enum RaceEnum {

    enum raceCaract {
        HUMAIN("Humain"),
        NAIN("Nain"),
        ELFE("Elfe"),
        DEMIORQUE("Demi-orque");

        raceCaract(String nom) {
        }
    }
    public static void choixRace(){
        raceCaract type = raceCaract.HUMAIN;
        //Race es = new Race();

    }
}
