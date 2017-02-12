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
    
    
     private int id;
     private int id_offreur;
     private int nb_place ;
     private String source ;
     private String destination ;
     private float prix ;
     private String description ;
     private Date date_pub ;
     private Date date_offre ;
     private int id_offre_accepte;
     private String etat;

    public Megavoiturage() {
    }

    public Megavoiturage(int id, int id_offreur, int nb_place, String source, String destination, float prix, String description, Date date_pub, Date date_offre, int id_offre_accepte, String etat) {
        this.id = id;
        this.id_offreur = id_offreur;
        this.nb_place = nb_place;
        this.source = source;
        this.destination = destination;
        this.prix = prix;
        this.description = description;
        this.date_pub = date_pub;
        this.date_offre = date_offre;
        this.id_offre_accepte = id_offre_accepte;
        this.etat = etat;
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

    public int getId_offre_accepte() {
        return id_offre_accepte;
    }

    public void setId_offre_accepte(int id_offre_accepte) {
        this.id_offre_accepte = id_offre_accepte;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
        
}
