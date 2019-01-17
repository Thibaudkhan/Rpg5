package fr.groupe4.cours.personnage.persoClasse;

import fr.groupe4.cours.personnage.Heros;
import fr.groupe4.cours.personnage.Personnage;

public class Archer extends Heros {

    public Archer() {

    }

    public void Arc(Personnage cible) {
        int archerDex = this.getCaract("Dextérité");
        int archerVie = this.getCaract("Vie");
        int cibleVie = cible.getCaract("Vie");
        int nb = (int) (Math.random() * 100);
        int cptpoison = 0;

        if (nb >= 2 && nb < 10) {
            cibleVie -= (archerDex * 3);
            cptpoison += cptpoison;
            System.out.println("Bravo ! Votre flèche a fait un coup critique ! ");
        } else if (nb < 2) {
            cptpoison += cptpoison;
            cptpoison = 2;
            cibleVie -= archerDex + cptpoison;
            System.out.println("Votre flèche touche l'ennemi et l'a empoisonné" + cibleVie);

        } else if (nb > 94) {
            archerVie -= archerDex;
            cptpoison += cptpoison;
            System.out.println("Mince ! Vous ratez votre flèche...");
        } else {
            cibleVie -= archerDex;
            cptpoison += cptpoison;
            System.out.println("Votre flèche touche l'ennemi");
        }
        System.out.println("La vie de la cible est " + cibleVie + "La vie du joueur est " + archerVie);

    }

    public void Attaque_Sournoise(Personnage cible){
        int archerDex = this.getCaract("Dextérité");
        int archerVie = this.getCaract("Vie");
        int cibleVie = cible.getCaract("Vie");
        int nb = (int) (Math.random() * 100);
        boolean furtivité;

        if(nb < 60){
            cibleVie -= archerDex;
            System.out.println("Coup critique, dague x2 !");
        }
        else if (nb >= 60 && nb < 80){
            System.out.println("Rater!");
        }
        else if (nb > 80){
            cibleVie -= (archerDex * 2);
            System.out.println("Coup critique, dague x2 !");
        }
        else if (furtivité = true){
            cibleVie -= (archerDex * 15);
            System.out.println("Attaque sournoise reussi ! dégât x15" + cibleVie);
        }
        else {
            cibleVie -= (archerDex / 15);
            System.out.println("Attaque sournoise ratée ! dégât divisé par 15" + cibleVie);
        }
    }
}



