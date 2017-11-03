/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class SousMarin extends Vehicule {

    // 'M'onter, 'D'escendre, 'S'table
    protected char etat = 'S';

    protected boolean monte = false;

    public SousMarin(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
    }

    @Override
    public void reculer() {

        super.reculer(); //To change body of generated methods, choose Tools | Templates.
        if (isMonte()) {
            this.y = this.y + 1;
            if (y>=0) y=0;
        } else {
            this.y = this.y - 1;
        }
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        if (monte == true) {
            this.y = this.y + 2;
            if (this.y >= 0) y=0;
        } else {
            this.y = this.y - 2;
        }

    }

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }

}
