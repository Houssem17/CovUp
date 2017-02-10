/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.interfaces;

import gf.entity.Agence;
import java.util.List;

/**
 *
 * @author elyes
 */
public interface AgenceInterface {
    
    public void ajouterAgence ( Agence agence );
    public boolean supprimerAgence (int agence_id);
    public boolean updateAgence (int agence_id);
    public List < Agence > listeAgence ();
    
}
