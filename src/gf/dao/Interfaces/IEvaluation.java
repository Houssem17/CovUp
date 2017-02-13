/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.dao.Interfaces;

import java.util.List;

/**
 *
 * @author Adel
 */
public interface IEvaluation {
    void ajouterEvaluation(IEvaluation e);
    void modifierEvaluation(IEvaluation e);
    List<IEvaluation> listerEvaluation(int idEvalue); /*Lister toutes les evauations 
            d'un utilisateur evalue est non pas toutes les evaluation de l'evaluateur */
    
}
