/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.swing.JFrame;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SwingTest {

    JFrame fenetre = new JFrame();

    @Test
    public void testFen() {
//Définit un titre pour notre fenêtre 
        fenetre.setTitle("Ma première fenêtre Java");
//Définit sa taille : 400 pixels de large et 100 pixels de haut 
        fenetre.setSize(400, 100);
//Nous demandons maintenant à notre objet de se positionner au centre 
        fenetre.setLocationRelativeTo(null);
//Termine le processus lorsqu'on clique sur la croix rouge 
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Et enfin, la rendre visible 
        fenetre.setVisible(true);

    }
}
