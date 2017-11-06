/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class TableauxTest {

    @Test
    public void testTab() {
        String[] tstr = new String[]{"Londres", "Rio", "Berlin"};

        for (int i = 0; i < tstr.length; i++) {
            System.out.println(tstr[i]);
        }
        System.out.println("***** Suite *****");
        for (String s : tstr) {
            System.out.println(s.toUpperCase());
        }

        System.out.println("***** Suite *****");

        //ArrayList<String> arf = new ArrayList<String>(Arrays.asList(tstr));
        ArrayList arf = new ArrayList(Arrays.asList(tstr));
        Iterator it;

        arf.add("Paris");
        arf.add(1, "Dublin");

        it = arf.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString().toLowerCase());

        }

        System.out.println("***** Fin *****");

    }

    @Test
    public void testTabNum() {

        VariablesTest vt = new VariablesTest();
        int[] tabi = new int[10];
        for (int i = 0; i < tabi.length; i++) {
            tabi[i] = i;
        }
        for (int i = 0; i < tabi.length; i++) {
            System.out.println(vt.carre(tabi[i]));
        }
        for (int i : tabi) {
            System.out.println(vt.carre(i));
        }

    }

}
