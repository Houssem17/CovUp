/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInterfaces;

import gf.entity.Utilisateur;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IUtilisateur {
    List<Utilisateur> listerUtilisateurs();
    Utilisateur consulterUtilisateur (int id);
    void ajouterUtilisateur(Utilisateur u);
    void supprimerUtilisateur(int id);
    void modifierUtilisateur(Utilisateur utilisateurModifie);
    
}
