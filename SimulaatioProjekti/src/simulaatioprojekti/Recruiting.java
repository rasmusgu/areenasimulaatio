package simulaatioprojekti;

import java.util.Scanner;
import java.util.ArrayList;

public class Recruiting {

    Parser input = new Parser();
    Army playerArmy, enemyArmy;

    public Recruiting() {
        this.playerArmy = new Army();
        //this.enemyArmy = new Army();
    }

    public void Värväys() {
        int määrä;

        //Kysyy käyttäjältä mitä unitteja se haluaa värvätä. Palauttaa syötteen Stringinä.
        this.input.Värväys();
        //Looppi pyörii niin kauan kun syöte EI ole "q" tai "quit" tai 1.
        while (!"q".equals(input.getSyöte()) && !"quit".equals(input.getSyöte())) {
            //Jos syöte on "(q)uit", lopettaa Värväysloopin.
            if ("q".equals(input.getSyöte()) || "quit".equals(input.getSyöte())) {

            }//Katsoo syötteestä mitä unittia haluttiin värvätä.
            else if ("swordsman".equals(input.getSyöte()) || "s".equals(input.getSyöte()) || "1".equals(input.getSyöte())) {
                //Kutsuu armeija oliosta addToArmy metodia, saa classin nimen ja inputin. Lisää armeijaan niin monta unittia kuin käyttäjä syöttää.
                this.playerArmy.addToArmy("swordsman", input);
                input.LisääUnitteja();
            } else if ("archer".equals(input.getSyöte()) || "a".equals(input.getSyöte()) || "2".equals(input.getSyöte())) {
                this.playerArmy.addToArmy("archer", input);
                input.LisääUnitteja();
            } else if ("mounted lancer".equals(input.getSyöte()) || "lancer".equals(input.getSyöte()) || "m".equals(input.getSyöte()) || "3".equals(input.getSyöte())) {
                this.playerArmy.addToArmy("lancer", input);
                input.LisääUnitteja();
            } else if ("dirty peasant".equals(input.getSyöte()) || "peasant".equals(input.getSyöte()) || "d".equals(input.getSyöte()) || "4".equals(input.getSyöte())) {
                this.playerArmy.addToArmy("peasant", input);
                input.LisääUnitteja();
            } else {
                //Jos syöte on väärä, antaa virheilmoituksen ja kysyy uudestaan.
                input.VääräSyöte();
                input.Värväys();
            }

        }
    }

    public Army getPlayerArmy() {
        return playerArmy;
    }

}
