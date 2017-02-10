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
    
 private    int id_agence ;
 private    String nom;
 private    String adresse ;
 private    int tel ;
 private    String e_mail ;
 private    Date date_suspension ;
 private    String login ;

    public Agence(int id_agence, String nom, String adresse, int tel, String e_mail, Date date_suspension, String login) {
        this.id_agence = id_agence;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
        this.e_mail = e_mail;
        this.date_suspension = date_suspension;
        this.login = login;
    }

    public int getId_agence() {
        return id_agence;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTel() {
        return tel;
    }

    public String getE_mail() {
        return e_mail;
    }

    public Date getDate_suspension() {
        return date_suspension;
    }

    public String getLogin() {
        return login;
    }

    public void setId_agence(int id_agence) {
        this.id_agence = id_agence;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setDate_suspension(Date date_suspension) {
        this.date_suspension = date_suspension;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
    
    
    
    
    
}
