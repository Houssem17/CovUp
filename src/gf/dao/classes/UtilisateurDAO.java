package gf.dao.classes;

import static com.sun.deploy.util.Waiter.set;
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
import static java.lang.reflect.Array.set;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

/**
 *
 * @author Houssem
 */
public class UtilisateurDAO implements IUtilisateurDAO<Utilisateur>{
    
    private static UtilisateurDAO instance;
    private Statement st;
    private ResultSet rs;
    
    public UtilisateurDAO() {
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
    
     public List<Utilisateur> displayAllList(){
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
     
     
    public void delete(Utilisateur o) {
        String req="delete from personne where id="+o.getId();
        Utilisateur u=displayById(o.getId());
        
          if(u!=null)
              try {
           
            st.executeUpdate(req);
             
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }else System.out.println("n'existe pas");
    }

    public ObservableList<Utilisateur> displayAll() {
        String req="select * from utilisateur";
        ObservableList<Utilisateur> list=FXCollections.observableArrayList();       
        
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
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

   
    public Utilisateur displayById(int id) {
           String req="select * from utilisateur where id ="+id;
           Utilisateur u=new Utilisateur();
        try {
            rs=st.executeQuery(req);
           // while(rs.next()){
            rs.next();
                u.setId(rs.getInt("id"));
                u.setNom(rs.getString("nom"));
                u.setPrenom(rs.getString("prenom"));
            //}  
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return u;
    }

    public boolean update(Utilisateur p) {
        String qry = "UPDATE utilisateur SET nom = '"+p.getNom()+"', prenom = '"+p.getPrenom()+"' WHERE id = "+p.getId();
        
        try {
            if (st.executeUpdate(qry) > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    
    public List <Utilisateur> search (String entry) throws SQLException {
        List <Utilisateur> liste = new ArrayList<>();
         Utilisateur u = new Utilisateur();
        
         String req=("SELECT * from utilisateur u where (u.e_mail "
                + "like ? or u.date_inscrit like ? or u.username like ?)   order by u.id desc");
         PreparedStatement stm;
         stm = ConnexionSingleton.getInstance().getCnx().prepareStatement(req);
        stm.setString(1, "%" + entry + "%");
        stm.setString(2, "%" + entry + "%");
        stm.setString(3, "%" + entry + "%");
          
        rs = stm.executeQuery();
        while (rs.next())
        {
            Utilisateur user = new Utilisateur(rs.getString("pseudo"),rs.getDate("date_inscrit").toLocalDate(),rs.getInt("id"),rs.getString("username"));
            liste.add(user);
        }
        
        return liste;
    }
    
    
}
