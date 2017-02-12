/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

import java.util.Date;

/**
 *
 * @author Houssem
 */
public class Covoiturage {
    
    
 private    int id;
 private    int id_offreur;
 private    String source ;
 private    String destination ;
 private    int nb_place ;
 private    float prix ;
 private    String description ;
 private    boolean est_regulier;
 private    Date date_pub ;
 private    Date date_offre ;
 private    Regularite regularite;
 private    int id_evenement;

    public Covoiturage() {
    }

    public Covoiturage(int id, int id_offreur, String source, String destination, int nb_place, float prix, String description, boolean est_regulier, Date date_pub, Date date_offre, Regularite regularite, int id_evenement) {
        this.id = id;
        this.id_offreur = id_offreur;
        this.source = source;
        this.destination = destination;
        this.nb_place = nb_place;
        this.prix = prix;
        this.description = description;
        this.est_regulier = est_regulier;
        this.date_pub = date_pub;
        this.date_offre = date_offre;
        this.regularite = regularite;
        this.id_evenement = id_evenement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_offreur() {
        return id_offreur;
    }

    public void setId_offreur(int id_offreur) {
        this.id_offreur = id_offreur;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
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

    public boolean isEst_regulier() {
        return est_regulier;
    }

    public void setEst_regulier(boolean est_regulier) {
        this.est_regulier = est_regulier;
    }

    public Date getDate_pub() {
        return date_pub;
    }

    public void setDate_pub(Date date_pub) {
        this.date_pub = date_pub;
    }

    public Date getDate_offre() {
        return date_offre;
    }

    public void setDate_offre(Date date_offre) {
        this.date_offre = date_offre;
    }

    public Regularite getRegularite() {
        return regularite;
    }

    public void setRegularite(Regularite regularite) {
        this.regularite = regularite;
    }

    public int getId_evenement() {
        return id_evenement;
    }

    public void setId_evenement(int id_evenement) {
        this.id_evenement = id_evenement;
    }


 
}
