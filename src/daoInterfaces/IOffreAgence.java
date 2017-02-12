/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInterfaces;

import gf.entity.OffreAgence;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IOffreAgence {
    void ajouterOffreAgence(OffreAgence o);
    List<OffreAgence> listerOffresAgenceParMegavoiturage(int idMegavoiturage);
    List<OffreAgence> listerOffresParAgence(int Agence);    
    void supprimerOffreAgence(int id);
    void modifierOffreAgence(OffreAgence o);
    
}
