/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.Agence;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IAgence {
    void ajouterAgence(Agence a);
    List<Agence> listerAgences();
    void modifierAgence(Agence a);
    void SupprimerAgence(Agence a);
    
}
