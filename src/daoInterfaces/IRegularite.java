/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInterfaces;

import gf.entity.Regularite;

/**
 *
 * @author Adel
 */
public interface IRegularite {
    void ajouterRegularite(Regularite r);
    void modifierRegularite(Regularite r);
    Regularite getRegularite(int idCovoiturage);
    void supprimerRegularite(int idCovoiturage);
    
}
