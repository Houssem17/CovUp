package gf.dao.classes;

import gf.entity.Utilisateur;
import gf.utils.ConnexionSingleton;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import gf.dao.Interfaces.IUtilisateurDAO;
import java.time.LocalDate;

/**
 *
 * @author Houssem
 */
public class UtilisateurDAO implements IUtilisateurDAO<Utilisateur>{
    
    private static UtilisateurDAO instance;
    private Statement st;
    private ResultSet rs;
    
    private UtilisateurDAO() {
        ConnexionSingleton cs=ConnexionSingleton.getInstance();
        try {
            st=cs.getCnx().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static UtilisateurDAO getInstance(){
        if(instance==null) 
            instance=new UtilisateurDAO();
        return instance;
    }

    @Override
    public void ajouterUtilisateur(Utilisateur u) {
        String req="insert into utilisateur"
                + " (nom,prenom,genre,username,password,cin,date_naissance,date_inscrit,tel,est_bloque,est_admin)"
                + " values ('"+u.getNom()+"','"+u.getPrenom()+"','"+u.getGenre()+"','"+u.getUsername()+"',"
                + "'"+u.getPassword()+"','"+u.getCin()+"','"+u.getDate_naissance()+"','"+u.getDate_inscrit()+"',"
                + "'"+u.getTel()+"','"+"0"+"','"+"0"+"')";
        
       //        int id,String nom, String prenom, char genre, String username, String password, int cin, 
                //LocalDate date_naissance, LocalDate date_inscrit, int tel, boolean est_bloque, boolean est_admin
        
        
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
