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
public class Actualite {
    
    
  private   int id_actualite ;
  private   Date date_publication ;
  private   String contenu ;

    public Actualite(int id_actualite, Date date_publication, String contenu) {
        this.id_actualite = id_actualite;
        this.date_publication = date_publication;
        this.contenu = contenu;
    }

    public int getId_actualite() {
        return id_actualite;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public String getContenu() {
        return contenu;
    }

    public void setId_actualite(int id_actualite) {
        this.id_actualite = id_actualite;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    
    
}
