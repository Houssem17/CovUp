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
public class DemandeCovoiturage {
    int id_demandeur;
    int id_covoiturage;
    boolean est_accepte;
    String commentaire;

    public DemandeCovoiturage() {
    }

    public DemandeCovoiturage(int id_demandeur, int id_covoiturage, boolean est_accepte, String commentaire) {
        this.id_demandeur = id_demandeur;
        this.id_covoiturage = id_covoiturage;
        this.est_accepte = est_accepte;
        this.commentaire = commentaire;
    }

    public int getId_demandeur() {
        return id_demandeur;
    }

    public void setId_demandeur(int id_demandeur) {
        this.id_demandeur = id_demandeur;
    }

    public int getId_covoiturage() {
        return id_covoiturage;
    }

    public void setId_covoiturage(int id_covoiturage) {
        this.id_covoiturage = id_covoiturage;
    }

    public boolean isEst_accepte() {
        return est_accepte;
    }

    public void setEst_accepte(boolean est_accepte) {
        this.est_accepte = est_accepte;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
      
    
}
