/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;





/**
 *
 * @author Formation
 */
public class FilmTest {
    
   @Test
   public void nouveauFilm() {
       
       Film f1 = new Film();
       f1.setTitre("dracula");
       
       Film f2 = new Film();
       f2.setTitre("Kung fu panda");
       
       System.out.println("f1 : "+f1.getTitre()+" , f2 : "+f2.getTitre());
       
       Film f3 = new Film("IT", "uu",1985, new Date());
       System.out.println(f3);
       
       f3.affiche();
       

   }
    
}
