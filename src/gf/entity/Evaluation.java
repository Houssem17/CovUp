/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

/**
 *
 * @author Houssem
 */
public class Evaluation {
    private int id;
    private int note;
    private String commentaire;
    private int id_evaluateur;
    private int id_evalue;

    public Evaluation() {
    }

    public Evaluation(int id, int note, String commentaire, int id_evaluateur, int id_evalue) {
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
        this.id_evaluateur = id_evaluateur;
        this.id_evalue = id_evalue;
    }

    public int getId_evalue() {
        return id_evalue;
    }

    public void setId_evalue(int id_evalue) {
        this.id_evalue = id_evalue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getId_evaluateur() {
        return id_evaluateur;
    }

    public void setId_evaluateur(int id_evaluateur) {
        this.id_evaluateur = id_evaluateur;
    }
    
    
    

}
