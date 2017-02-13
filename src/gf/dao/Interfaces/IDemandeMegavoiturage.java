/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.DemandeMegavoiturage;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IDemandeMegavoiturage {
    void ajouterDemande(DemandeMegavoiturage d);
    List<DemandeMegavoiturage> listerDemandeMegavoiturage(int idMegavoiturage);
    /*liste toute les demande faites à une offre Megavoiturage*/
    
    void supprimerDemande(int id);
    void modifierDemande(DemandeMegavoiturage d);
    
}
