package simulaatioprojekti;
import java.util.Random;

public class Nimi {
    Random r = new Random();
    String etunimi, sukunimi;
    //Etunimilista:
    String[] etunimet = {
        "Adam", "Geoffrey", "Gilbert", "Henry", "Hugh", "John",
        "Nicholas", "Peter", "Ralf", "Richard", "Robert", "Roger",
        "Simon", "Thomas", "Walter", "William",};
    //Sukunimilista:
    String[] sukunimet = {
        "Beauchamp",
        "Bigod", "Bohun", "Boleyn",
        "Cecil", "Courteney", "Dacre",
        "de Braose", "de Burgh", "de Clare",
        "de la Pole", "de Lacy", "de Montfort",
        "Devereux", "Dudley", "Fairfax",
        "Ferrers", "Fiennes", "Fitton",
        "Herbert", "Howard", "Lovell",
        "Montague", "Mortimer", "Mowbray",
        "Neville", "Percy", "Quincey",
        "Russell", "Sidney", "Stafford",
        "Stanley", "Talbot", "Umfraville",
        "Vane", "Vaughan", "Woodville"
    };

    public Nimi() {
        //Luokan luodessa randomisoi etunimen ja sukunimen listasta.
        this.etunimi = etunimet[r.nextInt(etunimet.length - 1)];
        this.sukunimi = sukunimet[r.nextInt(sukunimet.length - 1)];
    }

    
    // GETTERIT:
    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }
    
}
