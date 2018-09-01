package simulaatioprojekti;
import java.util.ArrayList;

public class Unit {

    public Tausta tausta;
    public Tarina tarina;
    public Nimi nimi;
    public Class classi;
    ArrayList<Class> classiList = new ArrayList();
    ArrayList<Unit> unitList = new ArrayList();
    
    //Luo unitti olion, saa randomi nimen ja randomi taustan. Saa classin parametrinä. Luo tarinan. 
    public Unit(String classiNimi) {
        this.tausta = new Tausta();
        this.nimi = new Nimi();
        this.classi = new Class(classiNimi);
        this.tarina = new Tarina(this);
    }

    public Unit(){
    }
    
    // GETTERIT:
    public Nimi getNimi() {
        return nimi;
    }

    public Tausta getTausta() {
        return tausta;
    }

    public Tarina getTarina() {
        return tarina;
    }

    public Class getClassi() {
        return classi;
    }
    
    public ArrayList<Unit> getLista() {
        return unitList;
    }

    
    
}
