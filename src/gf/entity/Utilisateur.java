/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

import java.time.LocalDate;
import java.util.Date;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Houssem
 */
public class Utilisateur {
    
    
    
     private SimpleIntegerProperty  id ;
     private SimpleStringProperty  e_mail ;
     private String nom ;
     private String prenom ;
     private char genre;
     private SimpleStringProperty  username;
     private String password;
     private SimpleIntegerProperty  cin ;
     private LocalDate date_naissance ;
    private ObjectProperty<LocalDate> date_inscrit;
     private SimpleIntegerProperty  tel ;
     private boolean est_bloque ;
     private boolean est_admin;
 
    public Utilisateur() {
    }

    public Utilisateur(int id,String e_mail , String nom, String prenom, char genre, String username, String password, int cin, LocalDate date_naissance, LocalDate date_inscrit, int tel, boolean est_bloque, boolean est_admin) {
        this.id = new SimpleIntegerProperty(id);
        this.e_mail = new SimpleStringProperty(e_mail);
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.username = new SimpleStringProperty(username);
        this.password = password;
        this.cin =new SimpleIntegerProperty(cin);
        this.date_naissance = date_naissance;
        this.date_inscrit = new SimpleObjectProperty<>(date_inscrit);
        this.tel =new SimpleIntegerProperty(tel);
        this.est_bloque = est_bloque;
        this.est_admin = est_admin;
    }

    public Utilisateur(String string, LocalDate toLocalDate, int aInt, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id = new SimpleIntegerProperty(id);
        
    }
     public SimpleIntegerProperty getIdProperty(){
        return id;}
    
    public String getE_mail ()
    {
    return e_mail.get() ;
   }
    public void setE_mail (String e_mail)
    { this.e_mail =  new SimpleStringProperty(e_mail);
    }
     public SimpleStringProperty getE_mailProperty(){
        return e_mail;}

     
     
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
        return username.get();
    }

    public void setUsername(String username) {
        this.username =  new SimpleStringProperty(username);
    }
public SimpleStringProperty getUsernameProperty(){
        return username;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCin() {
        return cin.get();
    }

    public void setCin(int cin) {
        this.cin = new SimpleIntegerProperty(cin);
        
    }
    
     public SimpleIntegerProperty getCinProperty(){
        return cin;}

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public LocalDate getDate_inscrit() {
        return date_inscrit.get();
    }

    public void setDate_inscrit(LocalDate date_inscrit) {
        this.date_inscrit = new SimpleObjectProperty<>(date_inscrit);
    }
    public ObjectProperty getDate_inscritProperty() {
            return date_inscrit;
        }

    public int getTel() {
        return tel.get();
    }

    public void setTel(int tel) {
        this.tel = new SimpleIntegerProperty(tel);
    }
    public SimpleIntegerProperty getTelProperty(){
        return tel;}

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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (this.est_admin != other.est_admin) {
            return false;
        }
        return true;
    }
    
     
}
