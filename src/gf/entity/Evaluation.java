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
    
 private    int id_evaluation ;
 private    String note ;
 private    String commentaire ;

    public Evaluation(int id_evaluation, String note, String commentaire) {
        this.id_evaluation = id_evaluation;
        this.note = note;
        this.commentaire = commentaire;
    }

    public int getId_evaluation() {
        return id_evaluation;
    }

    public String getNote() {
        return note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setId_evaluation(int id_evaluation) {
        this.id_evaluation = id_evaluation;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
    
    
}
