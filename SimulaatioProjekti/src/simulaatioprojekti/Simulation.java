package simulaatioprojekti;

public class Simulation {

    Parser input = new Parser();
    Army playerArmy = new Army(), enemyArmy = new Army();
    Recruiting värväys = new Recruiting();
    Inspect inspect = new Inspect();

    public Simulation() {
    }

    public void Menu() {
        while (!"q".equals(input.getSyöte()) && !"quit".equals(input.getSyöte())) {
            input.Menu();
            if ("q".equals(input.getSyöte()) || "quit".equals(input.getSyöte())) {
                //Kysyy pelaajalta haluaako tämä varmasti lopettaa.
                input.Lopetus(playerArmy);
            } else if ("r".equals(input.getSyöte()) || "recruit".equals(input.getSyöte())) {
                //Käynnistää värväyksen ja lisää pelaajan armeijaan juuri värvätyn armeijan.
                värväys.Värväys();
                playerArmy = värväys.getPlayerArmy();
            } else if ("i".equals(input.getSyöte()) || "inspect".equals(input.getSyöte()) || "army".equals(input.getSyöte())) {
                inspect.ArmyInspect(playerArmy);
            } else if ("s".equals(input.getSyöte()) || "start battle".equals(input.getSyöte()) || "battle".equals(input.getSyöte())) {
                System.out.println("Not yet implented.");
                //tähän tulee taistelun simulointi
            } else {
                input.VääräSyöte();
            }

        }
    }

    //GETTERIT: 
    public Army getPlayerArmy() {
        return playerArmy;
    }

    public Army getEnemyArmy() {
        return enemyArmy;
    }

}
