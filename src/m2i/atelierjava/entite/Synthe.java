/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Patch;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Formation
 */
public class Synthe {

    private boolean on;
    private String instrument;
    private int volume; // de 0 à 10

    public void boutonOnOff() {
        if (on) {
            on = false;
        } else {
            on = true;
            instrument = "Piano";
            volume = 2;
        }
    }

    public void eteindre() {
        on = false;
    }

    public void jouerNote(String note) {
        if (on) {
            System.out.println("Joue note " + note + "de l'instrument " + instrument);
            try {
                this.son();
            } catch (Exception e) {

            }

        }
    }

    public void son() throws MidiUnavailableException, InterruptedException {
        Synthesizer syn;
        MidiChannel canal;
        syn = MidiSystem.getSynthesizer();
        syn.open();
        canal = syn.getChannels()[0];
        canal.programChange(0);
        canal.noteOn(60, 100);
        canal.noteOff(60);
        
        
        
//        Synthesizer synth = MidiSystem.getSynthesizer();
//        synth.open();
//        MidiChannel[] chan = synth.getChannels();
//        Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
//
//        synth.loadInstrument(instrus[5]);
//
//        Patch p = instrus[5].getPatch();
//        int bank = p.getBank();
//        int program = p.getProgram();
//        program |= (bank & 1) << 7;
//        bank >>>= 1;
//        chan[4].programChange(bank, program);
//
//        chan[4].noteOn(60, 600);
//        Thread.sleep(1000);
//        JFrame frame = new JFrame("Sound1");
//        JPanel pane = new JPanel();
//        JButton button1 = new JButton("GO !");
//        frame.getContentPane().add(pane);
//        pane.add(button1);
//        frame.pack();
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.show();
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                chan[5].noteOn(60, 600);
//                //while (true);
//            }
//
//        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void volumePlus() {
        if (on) {
            if (volume < 10) {
                volume++;
            }
        }
    }

    public void volumeMoins() {
        if (on) {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public void afficher() {

        String txt = String.format("ON : %s , instrument : %s , volume : %d", on, instrument, volume);
        System.out.println(txt);
    }

}
