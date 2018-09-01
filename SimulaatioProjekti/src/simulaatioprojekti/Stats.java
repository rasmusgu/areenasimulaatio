package simulaatioprojekti;

public class Stats {
int id, atk, def, hit, dodge, movement, atkRange, maxHp, currentHP, hinta;
String nimi;

    public Stats(int id, int atk, int def, int hit, int dodge, int movement, int atkRange, int maxHp, int hinta, String nimi) {
      this.id = id;  
      this.atk = atk;
        this.def = def;
        this.hit = hit;
        this.dodge = dodge;
        this.movement = movement;
        this.atkRange = atkRange;
        this.maxHp = maxHp;
        this.hinta = hinta;
        this.nimi = nimi;
    }

    
    // GETTERIT:
    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getHit() {
        return hit;
    }

    public int getDodge() {
        return dodge;
    }

    public int getMovement() {
        return movement;
    }

    public int getAtkRange() {
        return atkRange;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getHinta() {
        return hinta;
    }

    public String getNimi() {
        return nimi;
    }

    // SETTERIT:
    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }    
    
    //toString().
    @Override
    public String toString() {
        return "Stats{" + "atk=" + atk + ", def=" + def + ", hit=" + hit + ", dodge=" + dodge + ", movement=" + movement + ", atkRange=" + atkRange + ", maxHp=" + maxHp + ", currentHP=" + currentHP + ", hinta=" + hinta + ", nimi=" + nimi + '}';
    }




    
}
