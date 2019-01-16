package fr.groupe4.cours.personnage.persoClasse;

import fr.groupe4.cours.personnage.Personnage;

public class Guerrier extends Personnage {

    public Guerrier() {

    }

    public void Epee (Personnage cible){
        int guerrierForce = this.getCaract("Force");
        int guerrierVie = this.getCaract("Vie");
        int cibleVie = cible.getCaract("Vie");
        int nb = (int) (Math.random() * 100 );
        int cpt = 0;
        if (nb >= 2 && nb < 10) {
            cibleVie -= (guerrierForce * 3);
            System.out.println("Coup Critique ! ");
        }
        else if (nb < 2 & cpt == 0){
            cibleVie -= (guerrierForce * 9999);
            System.out.println("Coup Ultime !");
            cpt++;
        }
        else if (nb > 94) {
            guerrierVie -= guerrierForce;
            System.out.println("Mince ! Vous ratez votre coup !");
        }
        else {
            cibleVie -= guerrierForce;
            System.out.println("Votre Epee a tranché l'ennemi");
        }
        System.out.println("La vie de la cible est "+ cibleVie + "La vie du joueur est "+ guerrierVie);
    }

}
