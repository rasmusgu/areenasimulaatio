package simulaatioprojekti;
import java.util.*;

public class Testi {
    
    public static void main(String[] args) {

        //TESTAA VIHOLLISARMEIJAN LUONNIN:
        Recruiting värväys = new Recruiting();
        Class classi;
        
        
        värväys.Värväys();
        Army pelaajaArmy = värväys.getPlayerArmy(), vihollisArmy = new Army();
        Parser input = new Parser();
        //pelaajaArmy.addToArmy("swordsman", input);
        /*System.out.println(pelaajaArmy.getUnitList().get(0));
        System.out.println(pelaajaArmy.getUnitList().size());
        pelaajaArmy.LaskeHinta(pelaajaArmy);
        System.out.println(pelaajaArmy.getArmyHinta());
        vihollisArmy.enemyArmy(pelaajaArmy);
        vihollisArmy.LaskeHinta(vihollisArmy);
        System.out.println(vihollisArmy.getArmyHinta());
        System.out.println(vihollisArmy.getUnitList().size());
        
        System.out.println(pelaajaArmy.ArmyTroops(pelaajaArmy, "swordsman").size());
        */
        for (int i = 0; i<pelaajaArmy.getUnitList().size() ; i++){
        System.out.println(pelaajaArmy.getUnitList().get(i).getClassi().getStatit().getNimi());
    }
        
        //TESTAA UNIT LISTAN TEON JA TARINAN LUONNIN
        /*Unit unit;
        ArrayList<Unit> units = new ArrayList();
        ArrayList<String> tarinat = new ArrayList();
        int määrä = 3;

        for (int i = 0; i < määrä; i++) {
            unit = new Unit();
            units.add(unit);
        }
        for (int i = 0; i < määrä; i++) {
            String tarina = (units.get(i).nimi.getEtunimi() + "'s father was a " + units.get(i).tausta.getIsäammatti() + ". " + units.get(i).nimi.getEtunimi() + " spend his youth as a " + units.get(i).tausta.getNuoruus() + ". "
                    + "After years of training, " + units.get(i).nimi.getEtunimi() + " " + units.get(i).nimi.getSukunimi() + " became a <Unit.Class.name> at the age of " + (units.get(i).tausta.getIkä() - 3) + ".");
            tarinat.add(tarina);
        }
        for (int i = 0; i < määrä; i++){
            System.out.println(tarinat.get(i)+"\n");
        }
        System.out.println(tarinat.get(0));*/
    
        //TESTAA UNITIN LUONNIN JA SEN TARINAN PRINTTAUKSEN
      /*Unit unit = new Unit();
        System.out.println(unit.getTarina());*/
      
      //TESTAA UNITIN LUONNIN CLASSISSA "sword", PRINTTAA SEN CLASSIN STATSIT:
      /*Unit unit = new Unit("sword");
        System.out.println(unit.getTarina()+"\n"+unit.getClassi());*/
      
      //TESTAA LUODA UNITTEJA LISTAAN ERI CLASSEILLA JA PRINTTAA NIIDEN TIEDOT
      /*ArrayList<Unit> unitlista = new ArrayList();
      Unit unit;
      int määrä = 3;
      String haluttuClassi;
      haluttuClassi = "sword";
      for (int i = 0; i < määrä; i++){
          unit = new Unit(haluttuClassi);
          unitlista.add(unit);
      }
      haluttuClassi = "bow";
      määrä = 2;
      for (int i = 0; i < määrä; i++){
          unit = new Unit(haluttuClassi);
          unitlista.add(unit);
      }
      for (int i = 0; i < unitlista.size(); i++){
          System.out.println(unitlista.get(i).getClassi()+"\n"+unitlista.get(i).getTarina()+"\n");
      }*/
    }

}
