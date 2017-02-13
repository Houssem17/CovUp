/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Houssem
 */
public class Utilisateur {
    
    
    
     private int id ;
     private String nom ;
     private String prenom ;
     private char genre;
     private String username;
     private String password;
     private int cin ;
     private LocalDate date_naissance ;
     private LocalDate date_inscrit ;
     private int tel ;
     private boolean est_bloque ;
     private boolean est_admin;

    public Utilisateur() {
    }

    public Utilisateur(int id, String nom, String prenom, char genre, String username, String password, int cin, LocalDate date_naissance, LocalDate date_inscrit, int tel, boolean est_bloque, boolean est_admin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.username = username;
        this.password = password;
        this.cin = cin;
        this.date_naissance = date_naissance;
        this.date_inscrit = date_inscrit; //LocalDate.now();
        this.tel = tel;
        this.est_bloque = est_bloque;
        this.est_admin = est_admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public LocalDate getDate_inscrit() {
        return date_inscrit;
    }

    public void setDate_inscrit(LocalDate date_inscrit) {
        this.date_inscrit = date_inscrit;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public boolean isEst_bloque() {
        return est_bloque;
    }

    public void setEst_bloque(boolean est_bloque) {
        this.est_bloque = est_bloque;
    }

    public boolean isEst_admin() {
        return est_admin;
    }

    public void setEst_admin(boolean est_admin) {
        this.est_admin = est_admin;
    }
    
     
}
