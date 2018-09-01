package simulaatioprojekti;

import java.util.Scanner;

public class Parser {

    Results result = new Results();
    Scanner lukija = new Scanner(System.in);
    String syöte;
    int syöteLuku;

    //Jos syöte on virheellinen, tulee virheilmoitus, tyhjentää scannerin ja tyhjentää syötteen ja palauttaa sen.
    public String VääräSyöte() {
        System.out.println("\nInvalid input, try again.");
        setSyöte(" ");
        return syöte;
    }

    //Ottaa käyttäjältä syötteen ja tekee siitä lowercase, palauttaa syötteen.
    public String Syöte() {
        this.syöte = lukija.next().toLowerCase();
        return syöte;
    }

    //Pyytää käyttäjältä syötteen, korvaa sen tyhjällä, palauttaa syötteen.
    public String AnyKey() {
        System.out.println("-Input anything to return previous menu-");
        this.syöte = lukija.next();
        this.syöte = "";
        return syöte;
    }

    //Kysyy kuinka monta kyseistä unittia halutaan värvätä, jos negatiivinen antaa ilmoituksen, jos ei LUKU syöte niin antaa toisen ilmoituksen.
    public int SyöteLuku(String classi) {
        System.out.println("\nHow many '" + classi + "' do you want to recruit?");
        this.syöte = classi;
        try {
            this.syöteLuku = Integer.parseInt(lukija.next());
            //lukija.nextLine();
            if (syöteLuku < 0) {
                System.out.println("You cannot sell your units.");
            }
            return syöteLuku;
        } catch (NumberFormatException e) {
            VääräSyöte();
            SyöteLuku(classi);
            return syöteLuku;
        }
    }

    //Kysyy pelaajalta haluaako tämä varmasti lopettaa, jos kyllä palauttaa syötteenä "q", ei niin palauttaa tyhjää ja väärä syöte antaa virheilmoituksen.
    public String Lopetus(Army playerArmy) {
        System.out.println("Are you sure you want to quit the simulation (y/n)?");
        Syöte();
        if ("q".equals(getSyöte()) || "k".equals(getSyöte()) || "kyllä".equals(getSyöte()) || "y".equals(getSyöte()) || "yes".equals(getSyöte())) {
            System.out.println("\nClosing down the simulation.");
            //EndResult() saa arvokseen simulaatiossa käytetyn pelaajan armeijan.
            result.EndResult(playerArmy);
            setSyöte("q");
            return this.syöte;
        } else if ("e".equals(getSyöte()) || "ei".equals(getSyöte()) || "n".equals(getSyöte()) || "no".equals(getSyöte())) {
            System.out.println("\nContinuing the simulation.");
            setSyöte(" ");
            return this.syöte;
        } else {
            VääräSyöte();
            //Kutsuu uudestaan lopetusta jos syöte oli väärin.
            Lopetus(playerArmy);
        }
        return syöte;
    }

    //Kysyy halutaanko lisää unitteja, EI vastaus sulkee värväyksen, Kyllä jatkaa, muuten virhe.
    public String LisääUnitteja() {
        System.out.println("\nFinished recruiting troops (y/n)?");
        Syöte();
        if ("y".equals(getSyöte()) || "yes".equals(getSyöte())) {
            lukija.nextLine();
            this.syöte = "q";
        } else if ("n".equals(getSyöte()) || "no".equals(getSyöte())) {
            Värväys();
        } else {
            VääräSyöte();
            LisääUnitteja();
        }
        return syöte;
    }

    // Kysyy mitä unitteja värvätään, palauttaa uuden syötteen.
    public String Värväys() {
        System.out.println("\nWhich units do you want to recruit?\n1. Swordsman.\n2. Archer.\n3. Mounted lancer.\n"
                + "4. Dirty peasant.\n(Q)uit recruiting.");
        Syöte();
        return syöte;
    }

    public String Menu() {
        System.out.println("MENU:\n(R)ecruit troops.\n(I)nspect your army.\n(S)tart Battle.\n(Q)uit game.");
        Syöte();
        return syöte;
    }

    public Parser() {
        this.syöte = " ";
    }

    // SETTERIT:
    public void setSyöte(String syöte) {
        this.syöte = syöte;
    }

    // GETTERIT:
    public String getSyöte() {
        return syöte;
    }

    public int getSyöteLuku() {
        return syöteLuku;
    }

}
