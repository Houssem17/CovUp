/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

/**
 *
 * @author Houssem
 */
public class Demande_megavoiturage {
    
    
 private    String etat ;
  private   String commentaire ;

    public Demande_megavoiturage(String etat, String commentaire) {
        this.etat = etat;
        this.commentaire = commentaire;
    }

    public String getEtat() {
        return etat;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
    
    
}
