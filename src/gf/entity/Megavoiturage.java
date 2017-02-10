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
public class Megavoiturage {
    
    
 private    int id_megavoiturage ;
 private    int nb_place ;
 private    String source ;
 private    String destination ;
 private    float prix ;
  private   String description ;
  private   Date date_pub ;
  private   Date date_offre ;

    public Megavoiturage(int id_megavoiturage, int nb_place, String source, String destination, float prix, String description, Date date_pub, Date date_offre) {
        this.id_megavoiturage = id_megavoiturage;
        this.nb_place = nb_place;
        this.source = source;
        this.destination = destination;
        this.prix = prix;
        this.description = description;
        this.date_pub = date_pub;
        this.date_offre = date_offre;
    }

    public int getId_megavoiturage() {
        return id_megavoiturage;
    }

    public void setId_megavoiturage(int id_megavoiturage) {
        this.id_megavoiturage = id_megavoiturage;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
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
    
    
    
    
    
}
