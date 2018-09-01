package simulaatioprojekti;

import java.util.ArrayList;
import java.util.Random;

public class Army {

    Unit unit;
    ArrayList<Unit> unitList;
    //------- Listaa saatavilla olevat classit, tämän voisi muuttaa pois HARDCODESTA----
    String[] classiLista = {"swordsman", "archer", "lancer", "peasant"};
    Parser inputti;
    int armyHinta;
    Random r = new Random();

    public Army() {
        this.unitList = new ArrayList();
        this.armyHinta = 0;
    }

    //Lisää armeijaan annettua unit.classia ja annetun määrän, palauttaa uuden listan.
    public ArrayList<Unit> addToArmy(String classi, Parser input) {
        input.SyöteLuku(classi);
        for (int i = 0; i < input.syöteLuku; i++) {
            unit = new Unit(input.getSyöte());
            this.unitList.add(unit);
        }
        return unitList;
    }

    //Laskee annetun armeijan sen hetkisen hinnan. Ensiksi nollaa, sen jälkeen laskee jokaisen unitin classi hinnan yhteen uudeksi armeija hinnaksi.
    public int LaskeHinta(Army army) {
        this.armyHinta = 0;
        for (int i = 0; i < army.getUnitList().size(); i++) {
            this.armyHinta += (army.getUnitList().get(i).getClassi().getStatit().getHinta());
        }
        return armyHinta;
    }

    //Luo vihollis armeijan pelaajan armeijan hinnan mukaan. Laskee ensiksi annetun armeijan (pelaajan) hinnan, jonka jälkeen randomisti lisää unitteja eri classeilla kunnes hinta on sama tai suurempi kuin pelaajalla.
    public ArrayList<Unit> enemyArmy(Army pelaajaArmy) {
        this.unitList.clear();
        for (int i = 0; i <= pelaajaArmy.getArmyHinta();) {
            this.unit = new Unit(classiLista[(r.nextInt(classiLista.length))]);
            this.unitList.add(unit);
            i = i + (unit.getClassi().getStatit().getHinta());
        }
        return unitList;
    }

    //Luo listan annetulla Classin nimellä, käy läpi annetun armeijan unittilistan ja filterraa sieltä halutut classit. Palauttaa Unitlistan
    public ArrayList<Unit> ArmySortTroops(Army army, String classi) {
        ArrayList<Unit> troopit = new ArrayList();
        for (int i = 0; i < army.getUnitList().size(); i++) {
            if (classi.equals(army.getUnitList().get(i).getClassi().getStatit().getNimi())) {
                troopit.add(army.getUnitList().get(i));
            }
        }
        return troopit;
    }

    //Palauttaa tietyn unitti classin määrän armeijassa. Saa parametrinä armeijan ja halutun classin nimen.
    public int ArmyTroopAmmount(Army army, String classi) {
        ArrayList<Unit> troopit = new ArrayList();
        int määrä;
        for (int i = 0; i < army.getUnitList().size(); i++) {
            if (classi.equals(army.getUnitList().get(i).getClassi().getStatit().getNimi())) {
                troopit.add(army.getUnitList().get(i));
            }
        }
        määrä = troopit.size();
        return määrä;
    }

    //Laskee armeijan totaali hinnan, käy läpi jokaisen unitin ja ynnää niiden hinnan.
    public int ArmyHinta() {
        this.armyHinta = 0;
        for (int i = 0; i < this.unitList.size(); i++) {
            this.armyHinta += (this.unitList.get(i).getClassi().getStatit().getHinta());
        }
        return armyHinta;
    }

      //Sorttaa annetun armeijan unitti listan unittien ID:n mukaan. Pienimmästä suurimpaan.
    public ArrayList<Unit> ArmySortByUnitId(){
        this.unitList.sort(Comparator.comparing(Unit::getUnitClassID));
    return this.unitList;
    }
    
    //Palauttaa arvona listan armeijassa esiintyvistä classi ID:eistä, pienimmästä suurimpaan.
    //Järjestää armeijan IDn mukaan -> luo uuden listan (type) -> lisää typelistaan ensimmäisen IDn -> hyppää yli kunne tulee uusi ID -> lisää sen IDn listaan -> Palauttaa TypeListan.
    public ArrayList<Integer> ArmyListTypes() {
        ArmySortByUnitId();
        ArrayList<Integer> unitTypeList = new ArrayList();
        unitTypeList.add(unitList.get(0).getUnitClassID());
        for (int i = 0; i < this.unitList.size(); i++) {
            if(unitList.get(i).getUnitClassID() != unitTypeList.get(unitTypeList.size()-1)){
                unitTypeList.add(unitList.get(i).getUnitClassID());
            }
        }
        return unitTypeList;
    }
  
// GETTERIT:
    public Unit getUnit() {
        return unit;
    }

    public int getArmyHinta() {
        return armyHinta;
    }

    public ArrayList<Unit> getUnitList() {
        return unitList;
    }

}
