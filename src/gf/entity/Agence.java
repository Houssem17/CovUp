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
public class Agence {
    
 private    int id ;
 private    String nom;
 private    String login ;
 private    String password;
 private    String adresse ;
 private    String description;
 private    int tel ;
 private    String email ;
 private    Date date_suspension ;

    public Agence() {
    }

    public Agence(int id, String nom, String login, String password, String adresse, String description, int tel, String email, Date date_suspension) {
        this.id = id;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.adresse = adresse;
        this.description = description;
        this.tel = tel;
        this.email = email;
        this.date_suspension = date_suspension;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_suspension() {
        return date_suspension;
    }

    public void setDate_suspension(Date date_suspension) {
        this.date_suspension = date_suspension;
    }

 
}
