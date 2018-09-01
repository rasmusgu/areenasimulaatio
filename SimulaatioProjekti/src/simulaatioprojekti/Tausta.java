package simulaatioprojekti;

import java.util.Random;

public class Tausta {

    Random r = new Random();
    int ikä;
    String isäammatti, nuoruus, tarina;
    //Isän ammattilista
    String[] isäAmmatti = {
        "Miller", "Stonemason", "Blacssmith", "Armorer",
        "Falconer", "Tailor", "Carpenter", "Plowman",
        "Butcher", "Goldsmith", "Metalsmith", "Groom",
        "Squire", "Page", "Silversmith", "Grocer",
        "Draper", "Furrier", "Fishmonger", "Baker", "Weaver"
    };
    //nuoruuslista
    String[] nuoruuslista = {
        "Squire", "Sheep herder", "Street Urchin", "Bandit",
        "Poacher", "Orphan"
    };

    //Luokan luodessa randomisoi iän väliltä 18-50, nuoruuden ja isänammatin listasta: 
    public Tausta() {
        this.ikä = r.nextInt(32) + 18;
        this.nuoruus = nuoruuslista[r.nextInt(nuoruuslista.length - 1)];
        this.isäammatti = isäAmmatti[r.nextInt(isäAmmatti.length - 1)];
    }

// GETTERIT:
    public String getIsäammatti() {
        return isäammatti;
    }

    public String getNuoruus() {
        return nuoruus;
    }

    public int getIkä() {
        return ikä;
    }

}
