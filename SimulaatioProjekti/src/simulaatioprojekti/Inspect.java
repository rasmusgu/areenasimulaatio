package simulaatioprojekti;

public class Inspect {

    Army army = new Army();
    int armeijaArvo, armeijaKoko, troopMäärä;
    Parser input = new Parser();

    public void ArmyInspect(Army army) {
        System.out.println("\nARMY INSPECTION:\nArmy size: " + army.getUnitList().size() + " units."
                + "\nYour army consists of: " + army.ArmyTroopAmmount(army, "Swordsman") + " swordsmen, " + army.ArmyTroopAmmount(army, "Archer") + " archers, " + army.ArmyTroopAmmount(army, "Mounted lancer") + " Mounted lancers and " + army.ArmyTroopAmmount(army, "Dirty peasant") + " Dirty peasants."
                + "\nArmy total value: " + army.ArmyHinta()
                + "\n(U)nit types.\n(V)iew units.\n(R)eturn to main menu.");
        input.Syöte();
        while (!"q".equals(input.getSyöte()) && !"quit".equals(input.getSyöte())) {
            if ("r".equals(input.getSyöte()) || "return".equals(input.getSyöte())) {
                System.out.println("Returing to the main menu.");
                input.setSyöte("q");
            } else if ("u".equals(input.getSyöte()) || "unit".equals(input.getSyöte())) {
                System.out.println("\nUNIT TYPE INFORMATION:"
                + "\nNot yet implemented.");
                input.AnyKey();

//Tähän tulee listaus unitti tyypeistä ja niiden statseita
            } else if ("v".equals(input.getSyöte()) || "view".equals(input.getSyöte())) {
                System.out.println("\nNot yet implemented.");
                input.AnyKey();
                ArmyInspect(army);
                //Tähän valinta minkä classin unitteja haluaa katsoa, listaa siihen KAIKKI sen tyypin unitit ja käyttäjä voi valita yhden niistä ja tarkastella sen tarinan
            } else {
                input.VääräSyöte();
                ArmyInspect(army);
            }

        }
    }

}
