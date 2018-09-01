package simulaatioprojekti;

import java.util.*;

public class Controller {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        
        //Aloittaa simulaation esittämällä MENUN:
        simulation.Menu();

    }
}
