package fr.groupe4.cours.personnage.persoClasse;

import fr.groupe4.cours.personnage.Personnage;

public class Magicien extends Personnage {

    public Magicien() {

    }

    public void bouleDeFeu (Personnage cible){
        int mageIntell = this.getCaract("Intelligence");
        int mageVie = this.getCaract("Vie");
        int cibleVie = cible.getCaract("Vie");
        cibleVie -= mageIntell;
    }

}
