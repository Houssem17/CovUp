/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.Evenement;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IEvenement {
    List<Evenement> listerEvenements();
    void ajouterEvenement(Evenement u);
    void supprimerEvenement(int id);
    void modifierEvenement(Evenement utilisateurModifie);
    
}
