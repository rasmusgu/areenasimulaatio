package simulaatioprojekti;
import java.util.ArrayList;

public class Class {
//int color;
//SpecialSkill skill;
Stats statit;
//                             ID  Atk Def Hit Dod Mov Rng HP  Cost Name
Stats swordsman = new Stats   (1,  20, 10, 10, 5,  2,  2,  50, 100, "Swordsman");
Stats archer = new Stats      (2,  15, 5,  5,  2,  0,  600,20, 150, "Archer");
Stats lancer = new Stats      (3,  25, 15, 10, 2,  3,  5,  80, 250, "Mounted lancer");
Stats peasant = new Stats     (4,  10, 3,  5,  6,  2,  3,  10, 50,  "Dirty peasant");

//Antaa oliolle classia vastaavat statsit.    
public Class(String classiNimi) {
        switch (classiNimi){
            case "swordsman":
                this.statit = swordsman;
                break;
            case "archer":
                this.statit = archer;
                break;
            case "lancer":
                this.statit = lancer;
                break;
            case "peasant":
                this.statit = peasant;
                break;
        }
    }

// GETTERIT:
    public Stats getStatit() {
        return statit;
    }

    @Override
    public String toString() {
        return "Class{" + "statit=" + statit + '}';
    }
    




    
}
