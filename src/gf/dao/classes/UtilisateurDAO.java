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
import java.sql.Date;
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
                + " (e_mail,nom,prenom,genre,username,password,cin,date_naissance,date_inscrit,tel,est_bloque,est_admin)"
                + " values ('"+u.getE_mail()+"','"+u.getNom()+"','"+u.getPrenom()+"','"+u.getGenre()+"','"+u.getUsername()+"',"
                + "'"+u.getPassword()+"','"+u.getCin()+"','"+u.getDate_naissance()+"','"+u.getDate_inscrit()+"',"
                + "'"+u.getTel()+"','"+"0"+"','"+"0"+"')";
       
        
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
     public List<Utilisateur> displayAllList() {
        String req="select * from utilisateur";
        List<Utilisateur> list=new ArrayList<>();
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
                Utilisateur u=new Utilisateur();
                u.setId(rs.getInt(1));
                u.setE_mail(rs.getString(2));
                u.setNom(rs.getString(3));
                u.setPrenom(rs.getString(4));
                u.setGenre(rs.getString(5).charAt(0));
                u.setUsername(rs.getString(6));
                u.setPassword(rs.getString(7));
                u.setCin(rs.getInt(8));
                u.setDate_naissance(rs.getDate(9).toLocalDate());
                u.setDate_inscrit(rs.getDate(10).toLocalDate());
                u.setTel(rs.getInt(11));
                u.setEst_bloque(rs.getBoolean(12));
                u.setEst_admin(rs.getBoolean(13));
            
                list.add(u);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    
}
