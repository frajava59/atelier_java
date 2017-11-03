/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite; 

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Serie {
    private String titre;
    private String synopsis;
    private int anneeSortie;
    private int nbSaisons;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public int getNbSaisons() {
        return nbSaisons;
    }

    public void setNbSaisons(int nbSaisons) {
        this.nbSaisons = nbSaisons;
    }
    
    
    public void afficheTout() {
        System.out.println(
                "Titre             : " + this.titre + "\n" +
                "Synopsis          : " + synopsis + "\n" +
                "Annee de sortie   : " + anneeSortie + "\n" +
                "Nombre de saisons : " + nbSaisons + "\n");
    }
    
    
    @Override
    public String toString() {
        return "Titre             : " + this.titre + "\n" +
                "Synopsis          : " + synopsis + "\n" +
                "Annee de sortie   : " + anneeSortie + "\n" +
                "Nombre de saisons : " + nbSaisons + "\n";
    }   
    
    public void initialise(String titre, String synopsis, int anneeSortie, int nbSaisons) 
    {
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeSortie = anneeSortie;
        this.nbSaisons = nbSaisons;
    }

    public Serie(String titre, String synopsis, int anneeSortie, int nbSaisons) {
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeSortie = anneeSortie;
        this.nbSaisons = nbSaisons;
    }
    
    public Serie() {
     
    }


        
    
    
}
