package fr.groupe4.cours.personnage;

import java.util.Scanner;

public class Race extends Personnage{

    public void choixRace(){
        System.out.println("Choisis ta race entre Humain, Nain, Elfe, Demi-Orque");
        boolean choixCaract = false;
        Scanner scanR = new Scanner(System.in);
        String nxtln = scanR.nextLine();
        RaceEnum type = null;
        while (choixCaract != true) {

            if (nxtln.equals("Humain")) {
                type = RaceEnum.HUMAIN;
                choixCaract = true;
            } else if (nxtln.equals("Nain")) {
                type = RaceEnum.NAIN;
                choixCaract = true;
            } else if (nxtln.equals("Elfe")) {
                type = RaceEnum.ELFE;
                choixCaract = true;
            } else if (nxtln.equals("Demi-Orque")) {
                type = RaceEnum.DEMIORQUE;
            } else {
                choixCaract = false;
            }
            if (type != null) {
                setCaract(type);
            }
        }

    }

    public void setCaract(RaceEnum type) {

            int raceForce;
            int raceInt;
            int raceSage;
            int raceConstit;
            int raceDex;


        switch (type) {
            case HUMAIN:
                System.out.println("les caract qui monte");
                raceForce = this.getCaract("Force");
                raceForce += 1;
                raceInt = this.getCaract("Intelligence");
                raceInt += 1;
                raceSage = this.getCaract("Sagesse");
                raceSage += 1;
                raceConstit = this.getCaract("Constitution");
                raceConstit += 1;
                raceDex = this.getCaract("Dextérité");
                raceDex += 1;
                System.out.println(raceForce);
                System.out.println(raceInt);
                System.out.println(raceSage);
                System.out.println(raceConstit);
                System.out.println(raceDex);

                break;
            case NAIN:
                raceForce = this.getCaract("Force");
                raceForce += 3;
                raceConstit = this.getCaract("Constitution");
                raceConstit += 1;
                raceInt = this.getCaract("Intelligence");
                raceInt -= 1;
                System.out.println(raceForce);
                System.out.println(raceConstit);
                System.out.println(raceInt);
                break;
            case ELFE:
                int ElfeInt = this.getCaract("Intelligence");
                ElfeInt += 2;
                int ElfeSag = this.getCaract("Sagesse");
                ElfeSag += 1;
                int ElfeDex = this.getCaract("Dextérité");
                ElfeDex += 1;
                System.out.println(ElfeDex);
                System.out.println(ElfeInt);
                System.out.println(ElfeSag);
                break;
            case DEMIORQUE:
                raceForce = this.getCaract("Force");
                raceForce += 2;
                raceConstit = this.getCaract("Constitution");
                raceConstit += 2;
                raceInt = this.getCaract("Intelligence");
                raceInt -= 1;
                System.out.println(raceForce);
                System.out.println(raceConstit);
                System.out.println(raceInt);
                break;
            default:
                break;
        }
    }
}
