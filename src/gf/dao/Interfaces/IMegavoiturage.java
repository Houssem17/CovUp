/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.Megavoiturage;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IMegavoiturage {
    void ajouterMegavoiturage(Megavoiturage m);
    List<Megavoiturage> listerMegavoiturage();   
    void supprimerMegavoiturage(int id);
    void modifierMegavoiturage(Megavoiturage c);
    
}
