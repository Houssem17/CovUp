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
    
 private    int id_evenement ;
  private   String description ;
  private   Date date_pub ;
  private   Date date_event ;
 private    String lieu ;

    public Evenement(int id_evenement, String description, Date date_pub, Date date_event, String lieu) {
        this.id_evenement = id_evenement;
        this.description = description;
        this.date_pub = date_pub;
        this.date_event = date_event;
        this.lieu = lieu;
    }

    public int getId_evenement() {
        return id_evenement;
    }

    public void setId_evenement(int id_evenement) {
        this.id_evenement = id_evenement;
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

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
    
    
    
    
}
