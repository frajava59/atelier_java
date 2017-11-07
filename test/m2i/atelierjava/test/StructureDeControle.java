/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class StructureDeControle {

    @Test
    public void testWhile() {

    }

    public void lancerSort(String s) {
        switch (s) {
            case "BAVE":
                System.out.println("Baaaahhhhhh");
                break;
            case "PUSTULE":
                System.out.println("Au secours");
                break;
            default:
                System.out.println("Tout va bien");
        }
    }

    @Test
    public void testSwitch() {
        String carte = "BAVE";

        lancerSort(carte);
        carte = "PUSTULE";
        lancerSort(carte);
        carte = "Autre";
        lancerSort(carte);

    }
}
