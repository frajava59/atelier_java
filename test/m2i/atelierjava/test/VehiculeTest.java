/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class VehiculeTest {

    //@Test
    public void testVehicule() {
        Vehicule v1 = new Vehicule("Ferrari", true, "Banbelle", "rouge", 2, 0, 0, 0, 1);
        v1.afficher();

        v1.avancer();
        v1.afficher();
        v1.setPas(5);
        v1.avancer();
        v1.afficher();
        v1.setPas(2);
        v1.reculer();
        v1.afficher();
    }

    @Test
    public void testAvion() {
        Avion a1 = new Avion("Airbus", false, "A180", "blanc", 500, 0, 0, 0, 800);
        a1.avancer();
        a1.afficher();
    }
    
    @Test
    public void testSousMarin() {
        SousMarin sm1 = new SousMarin("Russe", true, "Typhon", "noire", 0, 0, 0, 0, 5);
        sm1.avancer();
        sm1.afficher();
        sm1.setMonte(true);
        sm1.avancer();
        sm1.afficher();
        sm1.avancer();
        sm1.afficher();

    }

}
