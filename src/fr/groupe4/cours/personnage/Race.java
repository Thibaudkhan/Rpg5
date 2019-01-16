package fr.groupe4.cours.personnage;

public class Race extends Personnage{

    enum raceCaract {
        HUMAIN("Humain"),
        NAIN("Humain"),
        ELFE("Humain"),
        DEMIORQUE("Humain");

        raceCaract(String nom) {
        }
    }
    public static void main(String[] args) {
        raceCaract type = raceCaract.NAIN;

        Race es = new Race();
        String texte = es.getTexte(type);
        System.out.println(texte);
    }

    public String getTexte(raceCaract color) {
        String texte = "";


        switch (color) {
            case HUMAIN:
                System.out.println("les caract qui monte");

                int HumanForce = this.getCaract("Force");
                HumanForce += 1;
                int HumanInt = this.getCaract("Intelligence");
                HumanInt += 1;
                int HumanSag = this.getCaract("Sagesse");
                HumanSag += 1;
                int HumanConstit = this.getCaract("Constitution");
                HumanConstit += 1;
                int HumanDex = this.getCaract("Dextérité");
                HumanDex += 1;
                System.out.println(HumanForce);
                System.out.println(HumanInt);
                System.out.println(HumanSag);
                System.out.println(HumanConstit);
                System.out.println(HumanDex);

                break;
            case NAIN:
                int NainForce = this.getCaract("Force");
                NainForce += 3;
                int NainConstit = this.getCaract("Constitution");
                NainConstit += 1;
                int NainInt = this.getCaract("Intelligence");
                NainInt -= 1;
                System.out.println(NainForce);
                System.out.println(NainInt);
                System.out.println(NainConstit);
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
                texte = "";
                break;
            default:
                break;
        }
        return texte;
    }
}
