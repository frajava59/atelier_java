/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class CollectionTest {

//@Test    
public void testList() {
    
    List<String> listeFilms = new ArrayList<>();
    listeFilms.add("Dracula");
    listeFilms.add("Matrix");
    listeFilms.add("Winnie l'ourson");
    
    for (String l : listeFilms) {
        System.out.println(l);
    }
    System.out.println(listeFilms);
    System.out.println(listeFilms.size());
    
    }

@Test    
public void testListePaysOK() {
    
    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    l1.add("Belgique");
    l1.add("France");
    l2.add("Espagne");
    l2.add("Italie");
    l1.addAll(l2);
    
    System.out.println(l1);
    System.out.println(l1.size());
    
    Assert.assertEquals(4, l1.size());
    
    }
    
}
