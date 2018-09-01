package simulaatioprojekti;

public class Tarina {

    String tarina;

    public Tarina(Unit unit) {
        //Luokan luodessa otetaan kyseisen unitti muuttujaksi ja sitä käyttäen luodaan tarina:
        this.tarina = (unit.nimi.getEtunimi() + "'s father was a " + unit.tausta.getIsäammatti() + ". " + unit.nimi.getEtunimi() + " spend his youth as a " + unit.tausta.getNuoruus() + ". "
                + "After years of training, " + unit.nimi.getEtunimi() + " " + unit.nimi.getSukunimi() + " joined your army as a "+unit.classi.statit.getNimi()+" at the age of " + unit.tausta.getIkä() + ".");

    }

    // GETTERIT:
    public String getTarina() {
        return tarina;
    }
    
    //Metodi luo tarinan Stringiksi, joka voidaan tulostaa Stringinä sitä kutsuessa (esim. unit.getTarina):
    @Override
    public String toString() {
        return tarina;
    }

}
