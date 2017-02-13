/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.Actualite;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IActualite {
    void ajouterActualite(Actualite a);
    void supprimerActualite(Actualite a);
    List<Actualite> listerActualite();
    void modifierActualite(Actualite a);
}
