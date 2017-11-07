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

        String morceau = "do re mi do do re mi do mi fa sol mi fa sol sol la sol fa mi do do sol0 do do sol0 do";
        morceau = "do do do re mi re do mi re re do do do do re mi re do mi re re do re re re re la0 la0 re do si0 la0 sol0 ";
        //morceau = "re sol sol sol la si si si si la si do fa la sol re re si mi re re do do do do la re do do si si re";
        //System.out.println(morceau);
        
//        for (int i = 115;i<128;i++){
//            System.out.println(i);
//            s1.sound(3, "do", i, 400, 300);
//            Thread.sleep(200);
//        }
        
        //s1.sound(3, "do", 115, 400, 300);

        for (String zenote : morceau.split(" ")) {
            System.out.print(zenote.trim()+ ",");
            // sound(int channel, int note, int instrument, int duree, int bazar)
            //s1.sound(4, zenote.trim(), 127, 200, 300);
            //s1.sound(3, zenote.trim(), 5, 400, 300);
        }
        
        s1.sound(4, "do", 126, 3000, 300);
        s1.sound(6, "mi", 126, 3000, 300);
        s1.sound(8, "la", 126, 3000, 300);

    }

}
