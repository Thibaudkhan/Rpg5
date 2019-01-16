package fr.groupe4.cours.personnage.persoClasse;

import fr.groupe4.cours.personnage.Personnage;

public class Magicien extends Personnage {

    public Magicien() {

    }

    public void bouleDeFeu (Personnage cible){
        int mageIntell = this.getCaract("Intelligence");
        int mageVie = this.getCaract("Vie");
        int cibleVie = cible.getCaract("Vie");
        int nb = (int) (Math.random() * 100 );
        if (nb < 10) {
            cibleVie -= (mageIntell * 3);
            System.out.println("Bravo ! Votre boule de feu a fait un coup critique ! ");
        }
        else if (nb > 94) {
            mageVie -= mageIntell;
            System.out.println("Mince ! Vous ratez votre boule de feu et vous vous prenez les dégâts");
        }
        else {
            cibleVie -= mageIntell;
            System.out.println("Votre boule de feu touche l'ennemi");
        }
        System.out.println("La vie de la cible est "+cibleVie);
        System.out.println("La vie du joueur est "+mageVie);
    }

}
