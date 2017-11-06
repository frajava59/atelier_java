/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import m2i.atelierjava.entite.Synthe;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SyntheTest {

    @Test
    public void testAllumageOK() {

        Synthe s1 = new Synthe();
        Assert.assertFalse("Au depart OK", s1.isOn());
        s1.boutonOnOff();
        Assert.assertTrue( s1.isOn());
//        s1.afficher();
//        s1.boutonOnOff();
//        s1.afficher();
    }



    @Test
    public void testVolumeOK() {
      
            Synthe s1 = new Synthe();
            s1.boutonOnOff();
            
            int tempo = s1.getVolume();
            s1.volumePlus();
            Assert.assertEquals(tempo+1, s1.getVolume());
            
    }
    
    

    @Test
    public void testNote() throws MidiUnavailableException, InterruptedException {

        Synthe s1 = new Synthe();
        s1.boutonOnOff();
        //s1.afficher();
        //s1.jouerNote("DO");

        String morceau = "do re mi do re mi mi fa sol mi fa sol sol la sol fa mi do do sol0 do do sol0 do";
        //morceau = "re sol sol sol la si si si si la si do fa la sol re re si mi re re do do do do la re do do si si re";
        //System.out.println(morceau);

        for (String zenote : morceau.split(" ")) {
            System.out.print(zenote.trim()+ ",");
            // sound(int channel, int note, int instrument, int duree, int bazar)
            s1.sound(5, zenote.trim(), 7, 400, 300);
        }

    }

}
