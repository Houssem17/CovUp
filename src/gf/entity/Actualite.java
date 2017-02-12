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
    
    
  private   int id;
  private   Date date_publication ;
  private   String contenu ;
  private   int idUtilisateur;

    public Actualite(int id, Date date_publication, String contenu, int idUtilisateur) {
        this.id = id;
        this.date_publication = date_publication;
        this.contenu = contenu;
        this.idUtilisateur = idUtilisateur;
    }

    public Actualite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }


    
}
