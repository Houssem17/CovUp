/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import gf.entity.Shout;
import java.util.List;

/**
 *
 * @author Adel
 */
public interface IShout {
    void ajouterShout(Shout sh);
    void supprimerShout(Shout sh);
    List<Shout> listerShout();
    void modifierShout(Shout sh);
    
}
