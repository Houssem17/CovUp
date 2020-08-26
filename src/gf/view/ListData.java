/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.view;

import gf.dao.classes.UtilisateurDAO;
import gf.entity.Utilisateur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Houssem
 */
public class ListData {
    
     
    private ObservableList<Utilisateur> users=FXCollections.observableArrayList();

    public ListData() {
        
        UtilisateurDAO udao=UtilisateurDAO.getInstance();
        users= udao.displayAll();
        
    }
    
    public ObservableList<Utilisateur> getUsers(){
        return users;
    }
    
}
