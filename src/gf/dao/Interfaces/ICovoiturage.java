/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.Covoiturage;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface ICovoiturage {
    void ajouterCovoiturage(Covoiturage c);
    //dont forget to call ajouter regulariter
    List<Covoiturage> listerCovoiturage();
    //don't forget to call getRegularite
    List<Covoiturage> listerCovoiturageEvenement(int idEvenement);
    /*lister les covoiturages d'un evenement*/
    
    void supprimerCovoiturage(int id);
    //don't forget to delete regularite
    void modifierCovoiturage(Covoiturage c);
    //don't forget to update regularite
    
    
}
