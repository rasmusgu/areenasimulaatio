package simulaatioprojekti;

public class Results {

    public Results() {
    }

    
    
void EndResult(Army playerArmy){
        //Laskee pelaajan armeijan kokonais hinnan.
        playerArmy.LaskeHinta(playerArmy);


        // Filleri, kertoo vain kuinka monta sotilasta pelaajan ja vihollisen koko armeijassa on.
        System.out.println("\nEND RESULT:");
        System.out.println("Your army size was: " + playerArmy.getUnitList().size() + " soldiers and the total worth of your army is: " + playerArmy.getArmyHinta());
        //Filleri, printtaa kuinka monta swordmania pelaajan armyssa on.
        System.out.println("Your army had " + (playerArmy.ArmyTroopAmmount(playerArmy, "Swordsman")) + " swordsmen, " + (playerArmy.ArmyTroopAmmount(playerArmy, "Archer")) +" archers, "
                + (playerArmy.ArmyTroopAmmount(playerArmy, "Mounted lancer")) +" Mounted Lancers and " + (playerArmy.ArmyTroopAmmount(playerArmy, "Dirty peasant")) +" Dirty Peasants.");

}
  

}
