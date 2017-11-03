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
public class Film {
    
    private String titre;
    private String synopsis;
    private int anneeProduction;
    private Date dateCreation;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeProduction() {
        return anneeProduction;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setAnneeProduction(int anneeProduction) {
        this.anneeProduction = anneeProduction;
    }

    public Film(String titre, String synopsis, int anneeProduction, Date dateCreation) {
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeProduction = anneeProduction;
        this.dateCreation = dateCreation;
    }

    public Film() {
    }
    
    @Override
    public String toString() {
        return "Titre                  : " + this.titre + "\n" +
                "Synopsis              : " + synopsis + "\n" +
                "Annee de production   : " + anneeProduction + "\n" +
                "Date de creation      : " + dateCreation + "\n";
    }    
    
    public void affiche() {
        System.out.println(String.format("Film : %s , %s , %d , %s", titre,synopsis,anneeProduction,dateCreation));
    }
}
