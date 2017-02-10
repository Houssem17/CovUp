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
    
    
 private    int id_covoiturage ;
 private    String source ;
 private    String destination ;
 private    int nb_place ;
 private    float prix ;
 private    String description ;
 private    Date date_pub ;
  private   Date date_offre ;

    public Covoiturage(int id_covoiturage, String source, String destination, int nb_place, float prix, String description, Date date_pub, Date date_offre) {
        this.id_covoiturage = id_covoiturage;
        this.source = source;
        this.destination = destination;
        this.nb_place = nb_place;
        this.prix = prix;
        this.description = description;
        this.date_pub = date_pub;
        this.date_offre = date_offre;
    }

    public int getId_covoiturage() {
        return id_covoiturage;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getNb_place() {
        return nb_place;
    }

    public float getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate_pub() {
        return date_pub;
    }

    public Date getDate_offre() {
        return date_offre;
    }

    public void setId_covoiturage(int id_covoiturage) {
        this.id_covoiturage = id_covoiturage;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate_pub(Date date_pub) {
        this.date_pub = date_pub;
    }

    public void setDate_offre(Date date_offre) {
        this.date_offre = date_offre;
    }
     
    
    
}
