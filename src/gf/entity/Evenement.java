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
public class Evenement {

     private int id;
     private String description ;
     private Date date_pub ;
     private Date date_evenement ;
     private String lieu ;
     private int propose_par;

    public Evenement() {
    }

    public Evenement(int id, String description, Date date_pub, Date date_evenement, String lieu, int propose_par) {
        this.id = id;
        this.description = description;
        this.date_pub = date_pub;
        this.date_evenement = date_evenement;
        this.lieu = lieu;
        this.propose_par = propose_par;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate_evenement() {
        return date_evenement;
    }

    public void setDate_evenement(Date date_evenement) {
        this.date_evenement = date_evenement;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getPropose_par() {
        return propose_par;
    }

    public void setPropose_par(int propose_par) {
        this.propose_par = propose_par;
    }
     
     

 
    
}
