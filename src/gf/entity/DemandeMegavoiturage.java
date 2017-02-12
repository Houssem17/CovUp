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
public class DemandeMegavoiturage {
    private int id_demandeur;
    private int id_megavoiturage;
    private String commentaire;

    public DemandeMegavoiturage() {
    }

    public DemandeMegavoiturage(int id_demandeur, int id_megavoiturage, String commentaire) {
        this.id_demandeur = id_demandeur;
        this.id_megavoiturage = id_megavoiturage;
        this.commentaire = commentaire;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getId_demandeur() {
        return id_demandeur;
    }

    public void setId_demandeur(int id_demandeur) {
        this.id_demandeur = id_demandeur;
    }

    public int getId_megavoiturage() {
        return id_megavoiturage;
    }

    public void setId_megavoiturage(int id_megavoiturage) {
        this.id_megavoiturage = id_megavoiturage;
    }
    
    
    
    
 
    
}
