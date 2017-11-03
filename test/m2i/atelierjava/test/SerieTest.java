/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {
    
   @Test
   public void testAffichage() {
       
       Serie s1 = new Serie();
       s1.setTitre("Fear of the walking dead");
       s1.setSynopsis("Romantisme avec des zombies");
       s1.setAnneeSortie(2015);
       s1.setNbSaisons(3);
       
       s1.afficheTout();
       
       Serie s2 = new Serie();
       s2.setTitre("K2000");
       s2.setSynopsis("Romantisme avec une voiture qui parle");
       s2.setAnneeSortie(1992);
       s2.setNbSaisons(6);
       
       s2.afficheTout();
       
       System.out.println("_ avec tostring __\n");
       System.out.println(s1);
       
       Serie s3 = new Serie();
       s3.initialise("Dallas", "Jr", 1980, 5);
       s3.afficheTout();
 
   }
}
