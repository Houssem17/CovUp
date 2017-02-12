/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInterfaces;

import gf.entity.DemandeCovoiturage;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IDemandeCovoiturage {
    void ajouterDemande(DemandeCovoiturage d);
    List<DemandeCovoiturage> listerDemandeCovoiturage(int idCovoiturage);
    /*liste toute les demande faites à une offre covoiturage*/
    
    void supprimerDemande(int id);
    void modifierDemande(DemandeCovoiturage d);    
    
}
