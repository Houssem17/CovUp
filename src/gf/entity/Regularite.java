/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.entity;

/**
 *
 * @author Adel
 */
public class Regularite {
    private int id;
    private int idCovoiturage;
    private boolean lun;
    private boolean mar;
    private boolean mer;
    private boolean jeu;
    private boolean ven;
    private boolean sam;
    private boolean dim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCovoiturage() {
        return idCovoiturage;
    }

    public void setIdCovoiturage(int idCovoiturage) {
        this.idCovoiturage = idCovoiturage;
    }

    public boolean isLun() {
        return lun;
    }

    public void setLun(boolean lun) {
        this.lun = lun;
    }

    public boolean isMar() {
        return mar;
    }

    public void setMar(boolean mar) {
        this.mar = mar;
    }

    public boolean isMer() {
        return mer;
    }

    public void setMer(boolean mer) {
        this.mer = mer;
    }

    public boolean isJeu() {
        return jeu;
    }

    public void setJeu(boolean jeu) {
        this.jeu = jeu;
    }

    public boolean isVen() {
        return ven;
    }

    public void setVen(boolean ven) {
        this.ven = ven;
    }

    public boolean isSam() {
        return sam;
    }

    public void setSam(boolean sam) {
        this.sam = sam;
    }

    public boolean isDim() {
        return dim;
    }

    public void setDim(boolean dim) {
        this.dim = dim;
    }
    
    @Override
    public String toString() {
        return "Regularite{" + "id=" + id + ", idCovoiturage=" + idCovoiturage + ", lun=" + lun + ", mar=" + mar + ", mer=" + mer + ", jeu=" + jeu + ", ven=" + ven + ", sam=" + sam + ", dim=" + dim + '}';
    }
    
    
}
