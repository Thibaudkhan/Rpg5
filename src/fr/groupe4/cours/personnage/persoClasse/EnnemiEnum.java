package fr.groupe4.cours.personnage.persoClasse;

public enum EnnemiEnum {

    ORC1(15,7,12,5,20),
    ORC2(17, 10, 13, 7, 14),
    ORC3(13, 11, 14, 9, 18),
    GOBELIN1(7, 14, 18, 12, 12),
    GOBELIN2(3, 9, 12, 6, 10),
    GOBELIN3(12, 15, 20, 3, 15);

    private int force;
    private int intell;
    private int dext;
    private int sagesse;
    private int constitution;

    EnnemiEnum(int force, int intell, int dext, int sagesse, int constitution){
        this.force = force;
        this.intell = intell;
        this.dext = dext;
        this.sagesse = sagesse;
        this.constitution = constitution;
    }
}
