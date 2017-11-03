/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Synthe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SyntheTest {

    //@Test
    public void testAllumage() {

        Synthe s1 = new Synthe();

        s1.afficher();
        s1.boutonOnOff();
        s1.afficher();
        s1.boutonOnOff();
        s1.afficher();
    }

    //@Test
    public void testVolume() {

        Synthe s1 = new Synthe();

        s1.boutonOnOff();
        s1.volumePlus();
        s1.afficher();
        s1.volumeMoins();
        s1.afficher();
    }

    @Test
    public void testNote() {

        Synthe s1 = new Synthe();
        s1.boutonOnOff();
        s1.afficher();
        s1.jouerNote("DO");

    }

}
