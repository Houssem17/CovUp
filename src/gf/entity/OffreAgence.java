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
public class OffreAgence {
    private int id_agence;
    private int id_megavoiturage;
    private float prix;
    private String description;
    private boolean est_accepte;

    public OffreAgence() {
    }

    public OffreAgence(int id_agence, int id_megavoiturage, float prix, String description, boolean est_accepte) {
        this.id_agence = id_agence;
        this.id_megavoiturage = id_megavoiturage;
        this.prix = prix;
        this.description = description;
        this.est_accepte = est_accepte;
    }

    public boolean isEst_accepte() {
        return est_accepte;
    }

    public void setEst_accepte(boolean est_accepte) {
        this.est_accepte = est_accepte;
    }

    public int getId_agence() {
        return id_agence;
    }

    public void setId_agence(int id_agence) {
        this.id_agence = id_agence;
    }

    public int getId_megavoiturage() {
        return id_megavoiturage;
    }

    public void setId_megavoiturage(int id_megavoiturage) {
        this.id_megavoiturage = id_megavoiturage;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
